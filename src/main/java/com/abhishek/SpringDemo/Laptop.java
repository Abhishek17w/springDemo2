package com.abhishek.SpringDemo;

import org.springframework.stereotype.Component;

public class Laptop implements Computer{

	public Laptop() {
		//System.out.println("......");
	}
	
	public void compile() {
		System.out.println("code compiled by laptop......");
	}

}
