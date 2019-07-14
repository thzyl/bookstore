package com.cqjtu.bookstore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.AuthorInfo;
import com.cqjtu.bookstore.service.AuthorInfoService;

@Controller
@RequestMapping("/author")
public class AuthorInfoController {

	@Autowired
	AuthorInfoService authorInfoService;

	@RequestMapping("/login")
	public String login() {
		Date date = new Date();
		AuthorInfo authorInfo = new AuthorInfo();
		authorInfo.setAuthorName("thzyl");
		authorInfo.setAuthorTele("15736287593");
		authorInfo.setAuthorEmail("1837289175@qq.com");
		authorInfo.setAuthorPassword("thzyl1325");
		authorInfo.setAuthorVip("true");
		authorInfo.setAuthorId(String.valueOf(Math.abs((authorInfo.getAuthorTele() + date.toString()).hashCode()))
				+ Math.round(Math.random() * 100));
		authorInfo.setEnrollDate(date);
		authorInfoService.authorInfoEnroll(authorInfo);
		return "index";
	}

}
