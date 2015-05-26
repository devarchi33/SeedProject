package com.skyfly33.shop.web.controller;

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
import com.skyfly33.shop.web.service.Shop;

@Controller
public class DetailController {

	@Autowired
	Shop shopService;

	private static final Logger logger = LoggerFactory
			.getLogger(DetailController.class);

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request,
			HttpServletResponse response, Model model, Integer itemId) {
		
		//개별 상품 조회
		Item item = this.shopService.getItemListById(itemId);
		
		//모델 생성
		model.addAttribute("item", item);
		
		return "item/detail";
	}
}
