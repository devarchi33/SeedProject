package com.skyfly33.shop.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.skyfly33.shop.domain.User;
import com.skyfly33.shop.persistence.mapper.UserDao;

public class UserCatalogImpl implements UserCatalog {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByUserIdAndPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return this.userDao.findUserByUserIdAndPassword(userId, password);
	}

}
