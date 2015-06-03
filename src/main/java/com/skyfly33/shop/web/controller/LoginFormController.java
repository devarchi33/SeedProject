package com.skyfly33.shop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skyfly33.shop.web.service.Shop;

@Controller
public class LoginFormController {

	@Autowired
	private Shop shopService;

	private Validator loginValidator;

	public void setLoginValidator(Validator loginValidator) {
		this.loginValidator = loginValidator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String toLoginView() {
		return "login";
	}

}
