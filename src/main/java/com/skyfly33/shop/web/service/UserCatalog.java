package com.skyfly33.shop.web.service;

import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.User;

@Service
public interface UserCatalog {

	User getUserByUserIdAndPassword(String userId, String password);
}
