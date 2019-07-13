package com.cqjtu.bookstore.controller;

import java.util.List;

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
		List<UserInfo> userInfos = userInfoService.queryUserInfo();
		System.out.println("userId = " + userInfos.get(0).getUserId());
		System.out.println("userName = " + userInfos.get(0).getUserName());
		System.out.println("password = " + userInfos.get(0).getPassword());
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("2");
		userInfoService.userLogout(userInfo);
		return "index";
	}
}
