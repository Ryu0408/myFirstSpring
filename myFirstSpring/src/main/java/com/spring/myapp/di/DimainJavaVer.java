package com.spring.myapp.di;

import com.spring.myapp.di.classfile.Broadcast;
import com.spring.myapp.di.classfile.Singer;
import com.spring.myapp.di.classfile.Stage;

public class DimainJavaVer {

	public static void main(String[] args) {
		/*
		 * 문제 
		 * Singer객체와 Stage 객체를 만든 다음
		 * Stage에서 Singger가 노래를 부르는 상황을 먼저 코드를 구현하고
		 * 그 다음에는 Singger가 단독으로 노래를 부르는 상황을 코드로 구현하세요.
		 */

		Singer singer = new Singer();
		Stage stage = new Stage(singer);
		Broadcast broadcast = new Broadcast(stage);
		
		singer.sing();
		stage.perform();
		broadcast.broad();

	}

}
