package com.cqjtu.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqjtu.bookstore.bean.AuthorInfo;
import com.cqjtu.bookstore.dao.AuthorInfoDao;
import com.cqjtu.bookstore.service.AuthorInfoService;

@Service
public class AuthorInfoServiceImpl implements AuthorInfoService {

	@Autowired
	AuthorInfoDao authorInfoDao;

	@Override
	public void authorInfoEnroll(AuthorInfo authorInfo) {
		authorInfoDao.addAuthorInfo(authorInfo);
	}

	@Override
	public void authorInfoLogout(AuthorInfo authorInfo) {
		authorInfoDao.deleteAuthorInfo(authorInfo);
	}

	@Override
	public void authorInfoAlter(AuthorInfo authorInfo) {
		authorInfoDao.updateAuthorInfo(authorInfo);
	}

	@Override
	public List<AuthorInfo> queryAuthorInfo(AuthorInfo authorInfo) {
		return authorInfoDao.queryAuthorInfo(authorInfo);
	}

	@Override
	public long queryAuthorInfoCount(AuthorInfo authorInfo) {
		return authorInfoDao.queryAuthorInfoCount(authorInfo);
	}

}
