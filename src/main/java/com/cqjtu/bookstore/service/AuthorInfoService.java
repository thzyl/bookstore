package com.cqjtu.bookstore.service;

import java.util.List;

import com.cqjtu.bookstore.bean.AuthorInfo;

public interface AuthorInfoService {

	/**
	 * 注册用户
	 * 
	 * @param authorInfo
	 */
	public void authorInfoEnroll(AuthorInfo authorInfo);

	/**
	 * 注销用户
	 * 
	 * @param authorInfo
	 */
	public void authorInfoLogout(AuthorInfo authorInfo);

	/**
	 * 修改密码、昵称、手机号、邮箱等用户信息
	 * 
	 * @param authorInfo
	 */
	public void authorInfoAlter(AuthorInfo authorInfo);

	/**
	 * 检索用户信息
	 * 
	 * @param authorInfo
	 * @return
	 */
	public List<AuthorInfo> queryAuthorInfo(AuthorInfo authorInfo);

	/**
	 * 检索用户数量
	 * 
	 * @param authorInfo
	 * @return
	 */
	public long queryAuthorInfoCount(AuthorInfo authorInfo);
}
