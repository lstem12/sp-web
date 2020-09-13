package com.web.sp.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface UserService {
	public boolean doLogin(Map<String,Object> map, HttpSession hs);
}
