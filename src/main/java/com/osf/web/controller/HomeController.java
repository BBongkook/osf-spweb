package com.osf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String goHome() {
		return "index";
	}
	@RequestMapping("/test")
	public String goTest(Model model) {
		model.addAttribute("msg", "hello~");
		return "test";
	}// 무조건 스트링이여야해
}
