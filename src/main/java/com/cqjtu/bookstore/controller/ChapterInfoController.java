package com.cqjtu.bookstore.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.ChapterInfo;
import com.cqjtu.bookstore.bean.NovelInfo;
import com.cqjtu.bookstore.service.ChapterInfoService;

@Controller
@RequestMapping("/chapter")
public class ChapterInfoController {

	@Autowired
	ChapterInfoService chapterInfoService;

	@RequestMapping("/login")
	public String login() {
		Date date = new Date();
		ChapterInfo chapterInfo = new ChapterInfo();
		NovelInfo novelInfo = new NovelInfo();
		/*
		 * chapterInfo.setChapterName("梅瑟大学"); chapterInfo.setChapterCount(200);
		 * chapterInfo.setChapterOrder(1); chapterInfo.setCreateDate(date);
		 * chapterInfo.setChapterId(String.valueOf(Math.abs((chapterInfo.getChapterName(
		 * ) + date.toString()).hashCode())) + Math.round(Math.random() * 100));
		 * chapterInfoService.chapterCreate(chapterInfo);
		 */
		chapterInfo.setChapterId("10322691917");
//		novelInfo.setNovelId("80834885135");
//		chapterInfo.setNovelInfo(novelInfo);
		List<ChapterInfo> chapterInfos = chapterInfoService.queryChapterInfo(chapterInfo);
		Long long1 = chapterInfoService.queryChapterInfoCount(chapterInfo);
		return "index";
	}
}
