package com.shubham.shubhcore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public  void drive()
	{
		System.out.println("this is bike..");
	}

}
