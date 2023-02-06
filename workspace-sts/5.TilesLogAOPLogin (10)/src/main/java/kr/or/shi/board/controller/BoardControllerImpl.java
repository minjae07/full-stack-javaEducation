package kr.or.shi.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.shi.board.vo.ArticleVO;
import net.sf.json.JSONObject;
import kr.or.shi.board.service.BoardService;

@Controller("boardController")
public class BoardControllerImpl implements BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardControllerImpl.class);
	private static String ARTICLE_IMAGE = "C:\\workspace-sts\\article_image";
	@Autowired
	private BoardService boardService;
	@Autowired
	private ArticleVO articleVO;
	
	@Override
	@RequestMapping(value = "/board/listArticles.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String section_ = request.getParameter("section");
		String pageNum_ = request.getParameter("pageNum");
		
		int section = Integer.parseInt(((section_== null)? "1" : section_));
		int pageNum = Integer.parseInt(((pageNum_ == null)? "1" : pageNum_));
		
		Map<String, Integer> pagingMap = new HashMap<>();			/*section값과 pageNum값을 HashMap에 저장*/
		pagingMap.put("section", section);
		pagingMap.put("pageNum", pageNum);
		
		Map articleMap = boardService.listArticles(pagingMap);
		articleMap.put("section", section);
		articleMap.put("pageNum", pageNum);
		
		String viewName = (String)request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("articleMap", articleMap);
		
		return mav;
	}

	@Override
	@RequestMapping(value = "/board/keywordSearch.do", method= RequestMethod.GET, produces = "application/text; charset=utf8")
	public String keywordSearch(@RequestParam("keyword") String keyword, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//logger.info("===============================================================");
		
		if(keyword == null || keyword.equals(""))
			return null;
		
		keyword = keyword.toUpperCase();
		
	
		List<String> keywordList = boardService.keywordSearch(keyword);
		
		//최종 완성될  JSONObject 선언
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("keyword", keywordList);
		
		String jsonInfo = jsonObject.toString();
		
		return jsonInfo;
	}

	@Override
	@RequestMapping(value = "/board/searchBoards.do", method = RequestMethod.GET)
	public ModelAndView searchBoards(String searchWord, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		List<ArticleVO> boardsList = boardService.searchBoards(searchWord);
		
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("boardsList", boardsList);
		
		return mav;
	}
	
	@RequestMapping(value = "/board/articleForm.do", method = {RequestMethod.POST, RequestMethod.GET} )
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String)request.getAttribute("viewName");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		
		return mav;
	}	
	
}

















