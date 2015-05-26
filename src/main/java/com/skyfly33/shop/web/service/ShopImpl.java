package com.skyfly33.shop.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.Item;

@Service
public class ShopImpl implements Shop{
	
	@Autowired
	private ItemCatalog itemCatalog;
	
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

}
