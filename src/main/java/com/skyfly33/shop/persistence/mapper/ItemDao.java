package com.skyfly33.shop.persistence.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.skyfly33.shop.domain.Item;

@Repository
public interface ItemDao {

	List<Item> itemListSelect();
	
	Item itemListSelectById(int item_id);
	
}
