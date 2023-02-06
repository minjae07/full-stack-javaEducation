package kr.or.shi.interfacereview02.dao.oracle;

import kr.or.shi.interfacereview02.UserInfo;
import kr.or.shi.interfacereview02.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACLE DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		System.out.println("update into ORACLE DB Passward = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserUserInfo(UserInfo userInfo) {
		System.out.println("delete into ORACLE DB userName = " + userInfo.getUserId());
		
	}

}
