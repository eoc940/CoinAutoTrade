package com.coin.TradeServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeServerApplication.class, args);
		System.out.println();
	}

	public void func() {
		System.out.println(123);
	}

	@Override
	public String toString() {
		return super.toString();
	}


}
