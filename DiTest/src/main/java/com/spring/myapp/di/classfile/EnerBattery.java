package com.spring.myapp.di.classfile;

import org.springframework.stereotype.Component;

//@Component
public class EnerBattery implements IBattery {

	@Override
	public void useBattery() {
		System.out.println("힘쎄고 오래가는 건전지");

	}

}
