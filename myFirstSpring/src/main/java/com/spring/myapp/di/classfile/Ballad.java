package com.spring.myapp.di.classfile;

import org.springframework.stereotype.Component;

@Component
public class Ballad implements Singer{
	
	public void sing() {
		System.out.println("발라드가수가 소몰이를 합니다.");
	}
	
}
