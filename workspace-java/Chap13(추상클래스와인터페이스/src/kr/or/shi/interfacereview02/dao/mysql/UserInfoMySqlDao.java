package kr.or.shi.interfacereview02.dao.mysql;

import kr.or.shi.interfacereview02.UserInfo;
import kr.or.shi.interfacereview02.dao.UserInfoDao;

//UserInfoDao 인터페이스를 구현한 MySql 버전 dao
public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		System.out.println("update into MYSQL DB Passward = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserUserInfo(UserInfo userInfo) {
		System.out.println("delete into MYSQL DB userName = " + userInfo.getUserId());
		
	}

}
