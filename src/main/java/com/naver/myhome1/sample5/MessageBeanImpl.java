package com.naver.myhome1.sample5;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String greeting;
	private Outputter outputter;
	
	public Outputter getOutputter() {
		return outputter;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		System.out.println("MessageBeanImpl의 setOutputter()에서 값 저장");
	} // setter DI 설정

	// 생성자 호출을 통하여 name="Spring" 할당합니다.
	public MessageBeanImpl(String name) {
		this.name = name;
		System.out.println("MessageBeanImpl 생성자 입니다.");
	} // 생성자 정의

	@Override
	public void sayHello() {
		String message = greeting + name + "!";
		System.out.println("MessageBeanImpl의 sayHello() 호출 : " + message);
		try {
			outputter.output(message);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("MessageBeanImpl의 setGreeting()에서 값 저장");
	} // setter DI 설정 (스프링 용어)
}
