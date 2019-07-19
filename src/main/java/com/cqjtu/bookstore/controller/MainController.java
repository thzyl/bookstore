package com.cqjtu.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqjtu.bookstore.bean.NovelInfo;
import com.cqjtu.bookstore.service.NovelInfoService;

@Controller
@RequestMapping("/home")
public class MainController {

	@Autowired
	NovelInfoService novelInfoService;

	@RequestMapping("/moyun")
	public String EnterMoyun(HttpServletRequest request) {

		request.setAttribute("kindNu", getKindNuSum());
		return "moyun";
	}

	@RequestMapping("/loadframe")
	public String LoadFrame(HttpServletRequest request) {
		request.setAttribute("test", "test");
		return "mainview";
	}

	public List<Long> getKindNuSum() {
		List<String> kind = new ArrayList<>();
		List<Long> kindNu = new ArrayList<>();
		NovelInfo ni = new NovelInfo();
		kind.add("都市");
		kind.add("科幻");
		kind.add("历史");
		kind.add("现实");
		kind.add("青春");
		kind.add("武侠");
		kind.add("仙侠");
		kind.add("玄幻");
		kind.add("悬疑");
		kind.add("游戏");
		kind.add("言情");
		kind.add("轻小说");
		for (int i = 0; i < kind.size(); i++) {
			ni.setNovelStyle(kind.get(i));
			try {
				kindNu.add((novelInfoService.queryNovelInfoCount(ni)));
			} catch (Exception e) {

			}
		}
		return kindNu;
	}
}
