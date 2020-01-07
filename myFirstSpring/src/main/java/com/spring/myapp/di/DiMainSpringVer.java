package com.spring.myapp.di;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.myapp.di.classfile.Broadcast;
import com.spring.myapp.di.classfile.Stage;

public class DiMainSpringVer {

	public static void main(String[] args) {
		
		String[] path = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
				"file:src/main/webapp/WEB-INF/spring/root-context2.xml"};
		GenericXmlApplicationContext context = new GenericXmlApplicationContext
				(path);


		/*
		 * 문제
		 * 현재 Stage는 Singer에 대한 의존 관계를 가지고 있으며
		 * 이를 위해 bean-container에 STage와 Singer를 집어넣은 다음
		 * Stage가 Singer를 의존한다는 관계를 표시해 Stage를 bean-container에서 생성했습니다.
		 * 이제 Broadcast 클래스를 하나 만들어주세요. Broadcast클래스는 Stage에 대한 의존 관계를 가집니다.
		 * Broadcast 클래스의 broad()메서드는 "방송 송출용"이라는 문자열을 콘솔창에 출력해주고,
		 * 그다음 Stage의 perform()메서드를 이어서 호출합니다.
		 */
		
//		Broadcast broadcast = context.getBean("broadcast",Broadcast.class);
//		broadcast.broad();
		Stage stage1 = context.getBean("stage1",Stage.class);
		stage1.perform();
		
		Stage stage2 = context.getBean("stage2",Stage.class);
		stage2.perform();
		
		Broadcast broadcast1 = context.getBean("broadcast1",Broadcast.class);
		broadcast1.broad();
		
		Broadcast broadcast2 = context.getBean("broadcast2",Broadcast.class);
		broadcast2.broad();
		
		
		context.close();
	}

}
