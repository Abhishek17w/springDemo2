package com.abhishek.SpringDemo;

import org.springframework.stereotype.Component;

public class Desktop implements Computer{

	public Desktop() {
		//System.out.println("code compiled by desktop......");
	}
	
	public void compile() {
		System.out.println("code compiled by desktop......");
	}

}
