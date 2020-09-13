package com.web.sp.service.impl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.sp.dao.UserDAO;
import com.web.sp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean doLogin(Map<String, Object> map, HttpSession hs) {
		
		Map<String,Object> user = userDAO.selectUser(map);
		if(user!=null) {
			hs.setAttribute("user", user);
			return true;
		}
		return false;
	}

}
