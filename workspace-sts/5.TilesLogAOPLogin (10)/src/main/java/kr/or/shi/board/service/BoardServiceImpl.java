package kr.or.shi.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.shi.board.vo.ArticleVO;
import kr.or.shi.board.dao.BoardDAO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	

	@Override
	public Map listArticles(Map<String, Integer> pagingMap) throws Exception {
		
		List<ArticleVO> articlesList = boardDAO.selectAllArticles(pagingMap);		/* 전달된 pagingMap을 사용해 글 목록을 조회함*/
		int totArticles = boardDAO.selectTotArticles();								/* 테이블에 존재하는 글 수를 조회함 */
		
		Map articlesMap = new HashMap();
		articlesMap.put("articlesList", articlesList);
		articlesMap.put("totArticles", totArticles);
		
		return articlesMap;
	}


	@Override
	public List<String> keywordSearch(String keyword) throws Exception {
		
		List<String> list = boardDAO.selectKeywordSearch(keyword);
		
		return list;
	}


	@Override
	public List<ArticleVO> searchBoards(String searchWord) throws Exception {
		List<ArticleVO> boardsList = boardDAO.selectBoardsBySearchWord(searchWord);
		
		return boardsList;
	}

}






















