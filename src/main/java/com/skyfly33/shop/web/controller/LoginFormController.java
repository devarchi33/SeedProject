package com.skyfly33.shop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skyfly33.shop.domain.User;
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

	@ModelAttribute
	public User setUpForm() {
		return new User();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(User user, BindingResult bindingResult) {

		this.loginValidator.validate(user, bindingResult);

		ModelAndView mv = new ModelAndView();

		if (bindingResult.hasErrors()) {
			mv.getModel().putAll(bindingResult.getModel());
			return mv;
		}

		try {
			// 유저 정보 검색
			User loginUser = this.shopService.getUserByUserIdAndPassword(
					user.getUserId(), user.getPassword());

			// 유저가 있을때
			mv.setViewName("loginSuccess");
			mv.addObject("loginUser", loginUser);
			return mv;
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			// 유저가 없을 때
			bindingResult.reject("error.login.user");
			mv.getModel().putAll(bindingResult.getModel());
			return mv;
		}
	}

}
