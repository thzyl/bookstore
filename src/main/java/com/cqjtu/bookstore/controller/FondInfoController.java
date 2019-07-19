package com.cqjtu.bookstore.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.FondInfo;
import com.cqjtu.bookstore.service.FondInfoService;

@Controller
@RequestMapping("/fond")
public class FondInfoController {

	@Autowired
	FondInfoService fondInfoService;

	@RequestMapping("/login")
	public String login() {

		Date date = new Date();
		FondInfo fondInfo = new FondInfo();
		/*
		 * UserInfo userInfo1 = new UserInfo(); UserInfo userInfo2 = new UserInfo();
		 * userInfo1.setUserId("67501704880"); userInfo2.setUserId("13694743467");
		 * fondInfo.setFansInfo(userInfo1); fondInfo.setIdolInfo(userInfo2);
		 * fondInfo.setFondId( String.valueOf(Math.abs((userInfo1.getUserId() +
		 * userInfo2.getUserId() + date.toString()).hashCode()) +
		 * Math.round(Math.random() * 1000000000)));
		 * fondInfoService.concernFondInfo(fondInfo);
		 */
		fondInfo.setIdolId("67501704880");
		List<FondInfo> data = fondInfoService.queryFondInfo(fondInfo);
		Long data1 = fondInfoService.queryFondInfoCount(fondInfo);
		return "moyun";
	}
}
