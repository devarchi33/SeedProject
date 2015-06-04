package com.skyfly33.shop.utils;

import java.util.List;

import org.slf4j.Logger;

import com.skyfly33.shop.domain.Item;

public class LoggingUtil {

	public static void logging(Logger logger, List<Item> list) {
		if (list.size() > 0)
			logger.info("get itemList success!");
		else
			logger.error("get itemList fail...");
	}
}
