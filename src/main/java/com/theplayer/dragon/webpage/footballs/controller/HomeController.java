package com.theplayer.dragon.webpage.footballs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	
	@Autowired
	public HomeController() {
	}
	
	@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}
}
