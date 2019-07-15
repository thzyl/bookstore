package com.cqjtu.bookstore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.UserInfo;
import com.cqjtu.bookstore.service.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	@RequestMapping("/login")
	public String login() {

		Date date = new Date();
		UserInfo userInfo = new UserInfo();

		userInfo.setUserName("yk");
		userInfo.setUserTele("13330288945");
		userInfo.setUserEmail("1837289175@qq.com");
		userInfo.setUserPassword("yk999999");
		userInfo.setUserVip("false");
		userInfo.setUserId(String.valueOf(Math.abs((userInfo.getUserTele() + date.toString()).hashCode()))
				+ Math.round(Math.random() * 100));
		userInfo.setEnrollDate(date);
		userInfoService.userInfoEnroll(userInfo);

		/*
		 * userInfo.setUserId("54420508543"); userInfo.setVipDate(date);
		 * userInfoService.userInfoAlter(userInfo);
		 */
		return "index";
	}

}
