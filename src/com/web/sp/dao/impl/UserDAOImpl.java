package com.web.sp.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.web.sp.dao.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public Map<String, Object> selectUser(Map<String, Object> map) {
		if("test".equals(map.get("id"))) {
			if("test".equals(map.get("password"))) {

				Map<String,Object> user = new HashMap<>();
				user.put("name", "상화");
				user.put("id", "test");
				return user;
			}
		}
		return null;
	}

}
