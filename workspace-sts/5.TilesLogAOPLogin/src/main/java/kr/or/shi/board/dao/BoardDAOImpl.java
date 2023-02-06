package kr.or.shi.board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.or.shi.board.vo.ArticleVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ArticleVO> selectAllArticles(Map<String, Integer> pagingMap) throws DataAccessException {
		List<ArticleVO> articlesList = sqlSession.selectList("mapper.board.selectAllArticlesList", pagingMap);
		return articlesList;
	}

	@Override
	public int selectTotArticles() throws DataAccessException {
		int totArticles = sqlSession.selectOne("mapper.board.selectTotArticles");
		return totArticles;
	}

	@Override
	public List<String> selectKeywordSearch(String keyword) throws DataAccessException {
		List<String> list = sqlSession.selectList("mapper.board.selectKeywordSearch", keyword);
		
		return list;
	}

	@Override
	public List<ArticleVO> selectBoardsBySearchWord(String searchWord) throws DataAccessException {
		ArrayList<ArticleVO> list = (ArrayList)sqlSession.selectList("mapper.board.selectBoardsBySearchWord", searchWord);
		
		return list;
	}

}









