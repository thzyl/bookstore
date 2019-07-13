package com.cqjtu.bookstore.dao;

import java.util.List;

import com.cqjtu.bookstore.bean.UserInfo;

public interface UserInfoDao {

	/**
	 * 添加用户信息
	 * 
	 * @param userInfo
	 */
	public void addUserInfo(UserInfo userInfo);

	/**
	 * 删除用户信息
	 * 
	 * @param userInfo
	 */
	public void delUserInfo(UserInfo userInfo);

	/**
	 * 更新用户信息
	 * 
	 * @param userInfo
	 */
	public void updateUserInfo(UserInfo userInfo);

	/**
	 * 查询用户信息
	 * 
	 * @param userInfo
	 * @return
	 */
	public List<UserInfo> queryUserInfo();

}
