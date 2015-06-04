package com.skyfly33.shop.utils;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.skyfly33.shop.domain.User;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		// TODO Auto-generated method stub
		User user = (User) command;
		if (!StringUtils.hasLength(user.getUserId())) {
			errors.rejectValue("userId", "error.required");
		}

		if (!StringUtils.hasLength(user.getPassword())) {
			errors.rejectValue("password", "error.required");
		}

		if (errors.hasErrors()) {
			errors.reject("error.input.user");
		}

	}

}
