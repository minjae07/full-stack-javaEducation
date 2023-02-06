package kr.or.shi.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.or.shi.member.service.MemberService;
import kr.or.shi.member.vo.MemberVO;

@Controller("memberController")			/* @Controller이용해서 MemberControllerImpl 클래스에 대해 id가 memberController인 빈 자동 생성함. */
@EnableAspectJAutoProxy					/* aop 기능 활성화 */
public class MemberControllerImpl /* extends MultiActionController */ implements MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);
	@Autowired
	private MemberService memberService;	/* @Autowired이용해 id가 memberService인 빈 자동 주입함. */
	@Autowired
	private MemberVO memberVO;				/* @Autowired이용해 id가 memberVO인 빈 자동 주입함. */

	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text;charset=utf-8");
		
		String viewName = (String)request.getAttribute("viewName");
		
		logger.info("viewName" + viewName);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		
		return mav;
	}	
	
	@Override
	@RequestMapping(value = "/member/listMembers.do", method = RequestMethod.GET)		/* 두단계로 요청시 바로 해당 메서드 호출하도록 매핑함. */
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		logger.info("viewName : " + viewName);
		logger.debug("viewName : " + viewName);
		
		List membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("membersList", membersList);
		
		return mav;
	}
	


	//회원 가입 폼 (입력 값받는 폼)
	@RequestMapping(value = "/member/*Form.do", method = RequestMethod.GET)			/* 요청명이 Form.do로 끝나면 form()메서드 호출함. */
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	@RequestMapping(value = "/member/addMember.do", method = RequestMethod.POST)				/* 회원 가입창에서 전송된 회원 정보를 바로 MemberVO 객체에 설정함  */
	public ModelAndView addMember(@ModelAttribute("member") MemberVO member, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		/*
		 * String id = request.getParameter("id");
		 * 
		 * memberVO.setId(id);
		 */
		int result = memberService.addMember(member);			/* 설정된 member객체를 전달해 회원 등록함 */
		
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		
		return mav;
		
		
	}




	@RequestMapping(value = "/member/removeMember.do", method = RequestMethod.GET)		/* 전송된 id를 변수 id에 설정함. */
	public ModelAndView removeMember(@RequestParam("id") String id, 
								HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		
		return mav;
	}

	@RequestMapping(value = "/member/loginForm.do", method = RequestMethod.GET)
	public ModelAndView loginForm(@RequestParam(value = "result", required = false) String result,
								  @RequestParam(value = "action", required = false) String action,
							HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		
		HttpSession session = request.getSession();
		session.setAttribute("action", action);				//action값을 세션에 저장함.
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", result);
		mav.setViewName(viewName);
		
		return mav;
	}
	
	@Override
	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		memberVO = memberService.login(member);
		
		if(memberVO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", memberVO);
			session.setAttribute("isLogOn", true);
			
			//mav.setViewName("redirect:/member/listMembers.do");
			
			//로그인 성공시 세션에 저장된 action값을 가져옴 (action=/board/articleForm.do)
			String action = (String)session.getAttribute("action");
			session.removeAttribute("action");
			
			if (action != null) {
				if (action.equals("/board/articleForm.do")) {
					System.out.println("=====================articleForm=====================");
					mav.setViewName("redirect:" +action);
				}
				else if (action.equals("/board/replyForm.do")) {
					mav.setViewName("redirect:" +action);
				}
			}
			else {
				mav.setViewName("redirect:/member/listMembers.do");
			}
			
		
		}
		else {
			rAttr.addAttribute("result", "loginFailed");
			mav.setViewName("redirect:/member/loginForm.do");
		}
		
		
		return mav;
	}

	@Override
	@RequestMapping(value = "/member/logout.do", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("member");				/* 로그아웃 요청시 세션에 저장된 로그인 정보와 회원정보 삭제함. */
		session.removeAttribute("isLogOn");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/member/listMembers.do");
		
		return mav;
	}
		

}






















