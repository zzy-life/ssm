package com.xtkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xtkj.pojo.User;
import com.xtkj.service.InitService;

@Controller
public class IndexController {
	@Autowired
	private InitService service;

	@RequestMapping("/index")
	public String main(Model model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "index";
	}
}
