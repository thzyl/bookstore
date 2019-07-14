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
	public String index() {
		Date d = new Date();
		AuthorInfo authorInfo = new AuthorInfo();
		authorInfo.setAuthorName("thzyl");
		authorInfo.setAuthorTele("15736287593");
		authorInfo.setAuthorEmail("1827289175@qq.com");
		authorInfo.setAuthorPassword("thzyl1325");
		authorInfo.setAuthorVip("true");
		authorInfo.setAuthorId(String.valueOf(Math.abs((authorInfo.getAuthorTele() + d.toString()).hashCode()))
				+ Math.round(Math.random() * 100));
		authorInfo.setEnrollDate(d);
		authorInfoService.authorInfoEnroll(authorInfo);
		return "index";
	}

}
