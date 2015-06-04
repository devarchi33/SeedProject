package com.skyfly33.shop.web.service;

import com.skyfly33.shop.domain.User;

public interface UserCatalog {

	User getUserByUserIdAndPassword(String userId, String password);
}
