package kr.or.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.or.member.dao.MemberDAO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}



	@Override
	public List listMembers() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
