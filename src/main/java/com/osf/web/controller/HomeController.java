package com.osf.web.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
/*	@Autowired
	@Qualifier("ds")
//	private DataSource ds;
	
	@RequestMapping("/")
	public String goHome() {
		try {
			//log.info("con=>{}",ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("/test")
	public String goTest(Model model) {
		try {
			//log.info("con=>{}", ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("msg", "hello~");
		return "test";
	}// 무조건 스트링이여야해
*/}
