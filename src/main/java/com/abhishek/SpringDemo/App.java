package com.abhishek.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Alien obj = (Alien) factory.getBean("alien"); // dependency injection
		obj.code();
		//obj.age = 15;
		System.out.println(obj.getAge());
		obj.getCom().compile();
		/*Alien obj1 = (Alien) factory.getBean("alien"); // dependency injection
		obj1.code();
		System.out.println(obj1.age);*/

		/*
		 * a single object is being created by applicationContext, which is referred 2
		 * times. 1. if scope is not mentioned in bean tag in spring.xml, then any
		 * object created using ApplicationContext is a singleton 2. if scope is
		 * prototype in bean tag in spring.xml, then any object created using
		 * ApplicationContext can have any number of object instancesn
		 * 
		 * In case of singleton, object is created bydefault by just line 14. In case of
		 * prototype, object is not created bydefault, its created when getBean is
		 * called
		 */
	}
}
