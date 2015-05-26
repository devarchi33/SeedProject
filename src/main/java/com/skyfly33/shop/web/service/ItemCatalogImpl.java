package com.skyfly33.shop.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skyfly33.shop.domain.Item;
import com.skyfly33.shop.persistence.mapper.ItemDao;

@Service
public class ItemCatalogImpl implements ItemCatalog {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		return this.itemDao.itemListSelect();
	}

	@Override
	public Item getItemListById(int item_id) {
		// TODO Auto-generated method stub
		return this.itemDao.itemListSelectById(item_id);
	}

}
