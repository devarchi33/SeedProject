package com.skyfly33.shop.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.Item;

@Service
public interface Shop {

	List<Item> getItemList();
}
