package com.cqjtu.bookstore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.BookShelfInfo;
import com.cqjtu.bookstore.bean.NovelInfo;
import com.cqjtu.bookstore.bean.UserInfo;
import com.cqjtu.bookstore.service.BookShelfInfoService;

@Controller
@RequestMapping("/bookshelf")
public class BookshelfInfoController {

	@Autowired
	BookShelfInfoService bookShelfInfoService;

	@RequestMapping("/login")
	public String login() {
		Date date = new Date();
		BookShelfInfo bookShelfInfo = new BookShelfInfo();
		UserInfo userInfo = new UserInfo();
		NovelInfo novelInfo = new NovelInfo();

		userInfo.setUserId("67501704880");
		novelInfo.setNovelId("19469943903");
		bookShelfInfo.setUserInfo(userInfo);
		bookShelfInfo.setNovelInfo(novelInfo);
		bookShelfInfo.setReadLog(10);
		/*
		 * bookShelfInfo.setBookshelfId( String.valueOf(Math.abs((userInfo.getUserId() +
		 * novelInfo.getNovelId() + date.toString()).hashCode()) +
		 * Math.round(Math.random() * 1000000)));
		 * bookShelfInfoService.addBookShelfInfo(bookShelfInfo);
		 */

		bookShelfInfo.setBookshelfId("1586355882");
		/*
		 * List<BookShelfInfo> data =
		 * bookShelfInfoService.queryBookShelfInfo(bookShelfInfo); Long data1 =
		 * bookShelfInfoService.queryBookShelfInfoCount(bookShelfInfo);
		 */
		bookShelfInfo.setUserInfo(userInfo);
		bookShelfInfo.setNovelInfo(novelInfo);
		bookShelfInfo.setReadLog(9);
		bookShelfInfoService.BookShelfInfoAlter(bookShelfInfo);
		return "index";
	}
}
