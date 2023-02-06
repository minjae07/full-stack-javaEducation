package kr.or.shi.board.service;

import java.util.List;
import java.util.Map;

import kr.or.shi.board.vo.ArticleVO;

public interface BoardService {

	public Map listArticles(Map<String, Integer> pagingMap) throws Exception;

	public List<String> keywordSearch(String keyword) throws Exception;

	public List<ArticleVO> searchBoards(String searchWord) throws Exception;

}
