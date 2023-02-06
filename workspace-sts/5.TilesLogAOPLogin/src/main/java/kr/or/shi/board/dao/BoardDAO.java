package kr.or.shi.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import kr.or.shi.board.vo.ArticleVO;

public interface BoardDAO {

	public List<ArticleVO> selectAllArticles(Map<String, Integer> pagingMap) throws DataAccessException;

	public int selectTotArticles() throws DataAccessException;

	public List<String> selectKeywordSearch(String keyword) throws DataAccessException;

	public List<ArticleVO> selectBoardsBySearchWord(String searchWord) throws DataAccessException;

}













