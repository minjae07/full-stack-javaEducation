package kr.or.shi.interfacereview02.dao;

import kr.or.shi.interfacereview02.UserInfo;

//dao에서 제공되어야할 메서드를 선언한 인터페이스
public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updatetUserInfo(UserInfo userInfo);
	void deleteUserUserInfo(UserInfo userInfo);
}
