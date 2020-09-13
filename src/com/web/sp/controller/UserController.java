package com.web.sp.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.sp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/login",method=RequestMethod.GET)
	public String goLogin() {
		return "user/login";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String doLogin(@RequestParam Map<String,Object> map, Model model, HttpSession hs) {
		String id = (String)map.get("id");
		String password = (String)map.get("password");
		if(userService.doLogin(map, hs)) {
			model.addAttribute("msg","로그인 성공");
			model.addAttribute("url","/");
		}else {
			model.addAttribute("msg","로그인 실패");
			model.addAttribute("url","/user/login");
		}
		return "common/msg";
	}
	
	@RequestMapping(value="/user/view",method=RequestMethod.GET)
	public String doView(@RequestParam Map<String, Object> map, Model model) {
		return "common/msg";
	}
	
}
