package com.myapp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.myapp.cloud.messaging.PaymentSink;

@SpringBootApplication
@EnableEurekaClient
//Enable Cloud stream to connect to rabbitMQ and register a listener
@EnableBinding(PaymentSink.class)
public class PaymentMsApplication {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMsApplication.class, args);
	}
}
