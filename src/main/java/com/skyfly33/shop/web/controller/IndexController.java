package com.skyfly33.shop.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skyfly33.shop.domain.Item;
import com.skyfly33.shop.util.LoggingUtil;
import com.skyfly33.shop.web.service.Shop;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {

	@Autowired
	private Shop shopService;

	private static final Logger logger = LoggerFactory
			.getLogger(IndexController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		// ��ǰ ��� ���� ���
		List<Item> itemList = this.shopService.getItemList();
		
		LoggingUtil.logging(logger, itemList);

		// �� ����
		model.addAttribute("itemList", itemList);

		return "item/index";
	}

}
