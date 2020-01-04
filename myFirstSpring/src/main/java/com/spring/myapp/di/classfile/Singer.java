package com.spring.myapp.di.classfile;

import org.springframework.stereotype.Component;

@Component
public class Singer {
	
	public void sing() {
		System.out.println("가수가 노래를 합니다.");
	}
	
}
