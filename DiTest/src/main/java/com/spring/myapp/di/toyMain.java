package com.spring.myapp.di;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.myapp.di.classfile.Toy;



public class toyMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext
				("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		
		
		Toy toy = context.getBean("toy",Toy.class);
		toy.playToy();
		context.close();

	}

}
