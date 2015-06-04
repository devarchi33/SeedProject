package com.skyfly33.shop.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.Item;
import com.skyfly33.shop.domain.User;

@Service
public class ShopImpl implements Shop {

	@Autowired
	private ItemCatalog itemCatalog;
	@Autowired
	private UserCatalog userCatalog;

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		return this.itemCatalog.getItemList();
	}

	@Override
	public Item getItemListById(int item_id) {
		// TODO Auto-generated method stub
		return this.itemCatalog.getItemListById(item_id);
	}

	@Override
	public User getUserByUserIdAndPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return this.userCatalog.getUserByUserIdAndPassword(userId, password);
	}

}
