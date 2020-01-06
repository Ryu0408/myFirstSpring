package com.spring.myapp.di.classfile;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Toy {
	
	//@Autowired
	//@Qualifier("enerBattery")
	@Resource(name="duraBattery")
	IBattery battery;

	
	public void playToy() {
		System.out.println("장난감을 가지고 놉니다.");
		battery.useBattery();
	}
}
