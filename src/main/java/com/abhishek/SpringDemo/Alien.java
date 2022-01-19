package com.abhishek.SpringDemo;

public class Alien {
	
	private int age;
	private Computer com;
	
//	public Alien() {
//		System.out.println("Alien Object created..");
//	}
	public Alien(int age) {
		this.age = 12;
		System.out.println("constructor cal....");
	}
	
	public void code() {
		System.out.println("I'm coding....");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

}
