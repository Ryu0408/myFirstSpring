package com.spring.myapp.di.classfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Broadcast {
	
	
	//@Autowired
	private Stage stage;
	
	public Broadcast(Stage stage) {
		this.stage = stage;
	}
	
	public void broad() {
		System.out.print("방송 송출용 ");
		stage.perform();
	}
}
