package com.myapp.cloud.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.cloud.model.Order;
import com.myapp.cloud.service.OrderService;

@RestController
public class OrderPaymentWebApi {

	@Autowired
	private OrderService orderService;
	
	
	@GetMapping("/orderpayments")
	public List<Order> getAll() {
		return orderService.findAll();
	}
	
	@PostMapping("/orderpayments")
	public ResponseEntity<Order> placeAnOrder(@RequestBody Order order){
		orderService.placeNewOrder(order);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}
}
