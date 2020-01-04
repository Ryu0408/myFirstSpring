package com.spring.myapp.di;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.myapp.di.classfile.Stage;

public class DiMainSpringVer {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext
				("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		Stage stage = context.getBean("stage",Stage.class);
		stage.perform();
		context.close();

	}

}
