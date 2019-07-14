package com.cqjtu.bookstore.dao;

import java.util.List;

import com.cqjtu.bookstore.bean.AuthorInfo;

public interface AuthorInfoDao {

	/**
	 * 添加用户信息
	 * 
	 * @param authorInfo
	 */
	public void addAuthorInfo(AuthorInfo authorInfo);

	/**
	 * 删除用户信息
	 * 
	 * @param authorInfo
	 */
	public void deleteAuthorInfo(AuthorInfo authorInfo);

	/**
	 * 更新用户信息
	 * 
	 * @param authorInfo
	 */
	public void updateAuthorInfo(AuthorInfo authorInfo);

	/**
	 * 查询用户信息
	 * 
	 * @param authorInfo
	 * @return
	 */
	public List<AuthorInfo> queryAuthorInfo(AuthorInfo authorInfo);

	/**
	 * 查询用户数量
	 * 
	 * @param authorInfo
	 * @return
	 */
	public long queryAuthorInfoCount(AuthorInfo authorInfo);
}
