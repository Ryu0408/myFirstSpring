package com.spring.myapp.di.classfile;

import org.springframework.stereotype.Component;

@Component
public class Hiphop implements Singer{
	
	@Override
	public void sing() {
		System.out.println("힙합가수가 랩을 합니다.");
	}
}
