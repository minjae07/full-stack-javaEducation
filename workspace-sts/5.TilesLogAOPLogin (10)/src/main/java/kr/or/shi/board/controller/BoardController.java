package kr.or.shi.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public interface BoardController {

	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public @ResponseBody String keywordSearch(@RequestParam("keyword") String keyword, 
								HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView searchBoards(@RequestParam("searchWord") String searchWord, 
								HttpServletRequest request, HttpServletResponse response) throws Exception;
}
