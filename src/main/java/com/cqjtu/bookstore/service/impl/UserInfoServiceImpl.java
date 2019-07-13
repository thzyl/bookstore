package com.cqjtu.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqjtu.bookstore.bean.UserInfo;
import com.cqjtu.bookstore.dao.UserInfoDao;
import com.cqjtu.bookstore.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDao userInfoDao;

	@Override
	public void userEnroll(UserInfo userInfo) {
		userInfoDao.addUserInfo(userInfo);
	}

	@Override
	public void userLogout(UserInfo userInfo) {
		userInfoDao.delUserInfo(userInfo);
	}

	@Override
	public void userAlter(UserInfo userInfo) {
		userInfoDao.updateUserInfo(userInfo);
	}

	@Override
	public List<UserInfo> queryUserInfo() {
		return userInfoDao.queryUserInfo();
	}

}
