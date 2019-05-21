package com.myapp.cloud.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.cloud.model.Payment;
import com.myapp.cloud.repository.PaymentRepository;

@RestController
public class PaymentWebApi {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	
	@PostMapping("/payments")
	public ResponseEntity<Payment> add(@RequestBody Payment payment){
		paymentRepository.save(payment);
		return new ResponseEntity<Payment>(payment, HttpStatus.CREATED);
				
	}
	
	@GetMapping("/payments")
	public ResponseEntity<List<Payment>> getPayments(){
		List<Payment> list = paymentRepository.findAll();
		return new ResponseEntity<List<Payment>>(list, HttpStatus.OK);
				
	}

}
