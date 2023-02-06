package kr.or.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import kr.or.member.service.MemberService;
import kr.or.member.service.MemberServiceImpl;

public class MemberControllerImpl extends MultiActionController implements MemberController {
	private MemberService memberService;
	
	public void setMemberService(MemberServiceImpl memberService) {
		this.memberService = memberService;
	}



	@Override
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
