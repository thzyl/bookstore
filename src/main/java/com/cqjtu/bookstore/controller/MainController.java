package com.cqjtu.bookstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

	@RequestMapping("moyun")
	public String EnterMoyun(HttpServletRequest request) {

		request.setAttribute("kindCount", "");
		return "moyun";
	}
}
