package com.myapp.cloud.service;

import java.util.List;



import com.myapp.cloud.model.Order;

public interface OrderService {


	List<Order> findAll();
	
	String placeNewOrder(Order order);
}
