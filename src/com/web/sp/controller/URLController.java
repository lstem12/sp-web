package com.web.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class URLController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String root() {
		return "index";
	}
}
