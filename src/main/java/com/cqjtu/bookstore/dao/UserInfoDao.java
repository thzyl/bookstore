package com.cqjtu.bookstore.dao;

import java.util.List;

import com.cqjtu.bookstore.bean.UserInfo;

public interface UserInfoDao {

	/**
	 * 添加用户信息
	 * 
	 * @param userInfo
	 */
	public void addUser(UserInfo userInfo);

	/**
	 * 删除用户信息
	 * 
	 * @param userInfo
	 */
	public void delUser(UserInfo userInfo);

	/**
	 * 更新用户信息
	 * 
	 * @param userInfo
	 */
	public void updateUser(UserInfo userInfo);

	/**
	 * 查询用户信息
	 * 
	 * @param userInfo
	 * @return
	 */
	public List<UserInfo> queryUser(UserInfo userInfo);

	/**
	 * 根据Id查询用户信息
	 * 
	 * @param userInfo
	 * @return
	 */
	public UserInfo queryUserById(UserInfo userInfo);
}
