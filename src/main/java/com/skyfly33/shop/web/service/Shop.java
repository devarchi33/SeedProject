package com.skyfly33.shop.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.Item;
import com.skyfly33.shop.domain.User;

@Service
public interface Shop {

	List<Item> getItemList();
	
	Item getItemListById(int item_id);
	
	User getUserByUserIdAndPassword(String userId, String password);
}
