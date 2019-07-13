package com.cqjtu.bookstore.service;

import java.util.List;

import com.cqjtu.bookstore.bean.UserInfo;

public interface UserInfoService {

	/**
	 * 用户注册
	 * 
	 * @param userInfo
	 */
	public void userEnroll(UserInfo userInfo);

	/**
	 * 用户注销
	 * 
	 * @param userInfo
	 */
	public void userLogout(UserInfo userInfo);

	/**
	 * 修改密码
	 * 
	 * @param userInfo
	 */
	public void userAlter(UserInfo userInfo);

	/**
	 * 查询用户信息
	 * 
	 * @param userInfo
	 */
	public List<UserInfo> queryUserInfo();

}
