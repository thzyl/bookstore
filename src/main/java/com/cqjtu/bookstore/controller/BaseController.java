package com.cqjtu.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class BaseController {

	@RequestMapping("/login")
	public String login() {
		return "index";
	}
}
