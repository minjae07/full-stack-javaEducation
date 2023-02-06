package kr.or.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class MemberDAOImpl implements MemberDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAllMemberList() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
