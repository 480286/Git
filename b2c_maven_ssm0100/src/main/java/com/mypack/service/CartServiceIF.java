package com.mypack.service;

import java.util.List;

import com.mypack.entity.Cart;

public interface CartServiceIF {

	boolean insertGoods(Cart cart);
	
	public Cart queryCartBygId(int gId);

}