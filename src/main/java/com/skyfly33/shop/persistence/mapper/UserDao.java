package com.skyfly33.shop.persistence.mapper;

import org.springframework.stereotype.Repository;

import com.skyfly33.shop.domain.User;

@Repository
public interface UserDao {

	User findUserByUserIdAndPassword(String userId, String password);
}
