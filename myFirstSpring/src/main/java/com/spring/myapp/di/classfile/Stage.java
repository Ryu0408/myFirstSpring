package com.spring.myapp.di.classfile;

public class Stage {
	
	private Singer singer;
	
	public Stage(Singer singer) {
		this.singer = singer;
	}
	
	public void perform() {
		System.out.print("무대에서 ");
		singer.sing();
	}
	
}
