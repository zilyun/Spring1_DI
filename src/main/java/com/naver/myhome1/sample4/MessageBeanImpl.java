package com.naver.myhome1.sample4;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String greeting;

	// 생성자 호출을 통하여 name="Spring" 할당합니다.
	public MessageBeanImpl(String name) {
		this.name = name;
	} // 생성자 정의

	@Override
	public void sayHello() {
		System.out.println(greeting + name + "!");
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

	// setGreeting 메소드 호출을 통하여 greeting="안녕하세요!" 할당합니다.
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
