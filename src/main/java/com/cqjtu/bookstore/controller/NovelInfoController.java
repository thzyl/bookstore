package com.cqjtu.bookstore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.NovelInfo;
import com.cqjtu.bookstore.bean.UserInfo;
import com.cqjtu.bookstore.service.NovelInfoService;

@Controller
@RequestMapping("/novel")
public class NovelInfoController {

	@Autowired
	NovelInfoService novelInfoService;

	@RequestMapping("/login")
	public String login() {
		Date date = new Date();
		NovelInfo novelInfo = new NovelInfo();
		UserInfo userInfo = new UserInfo();

		novelInfo.setNovelName("魔都");
		novelInfo.setNovelStyle("玄幻");
		novelInfo.setNovelStatus("连载");
		novelInfo.setNovelAttribute("免费");
		novelInfo.setCreateDate(date);
		novelInfo.setUpdateDate(date);
		novelInfo.setNovelGrade(8.5);
		novelInfo.setNovelCount(1024);
		novelInfo.setPraiseCount(50);
		novelInfo.setNovelId(
				String.valueOf(Math.abs((novelInfo.getNovelName() + novelInfo.getCreateDate().toString()).hashCode()))
						+ Math.round(Math.random() * 100));
		novelInfoService.novelCreate(novelInfo);

		/*
		 * novelInfo.setNovelId("3227694397"); Long data =
		 * novelInfoService.queryNovelInfoCount(novelInfo); List<NovelInfo> data1 =
		 * novelInfoService.queryNovelInfo(novelInfo);
		 */

		/*
		 * novelInfo.setNovelId("3227694397"); novelInfo.setNovelLable("都市，玄幻");
		 * novelInfoService.novelAlter(novelInfo);
		 */

		return "index";
	}
}
