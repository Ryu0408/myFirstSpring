package com.spring.myapp.di;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.myapp.di.classfile.Toy;



public class toyMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext
				("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		
		
		Toy toy1 = context.getBean("toy1",Toy.class);
		toy1.playToy();
		
		Toy toy2 = context.getBean("toy2",Toy.class);
		toy2.playToy();
		context.close();

	}

}
