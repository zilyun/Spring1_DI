package com.naver.myhome1.sample5;


// 스프링을 이용하여 클래스 사이의 결합 상태를 느슨하게 만듭니다.
public class HelloApp_java {
	public static void main(String[] args) {
		MessageBeanImpl bean = new MessageBeanImpl("Spring");
		bean.setGreeting("안녕하세요!");
		bean.sayHello();
	}
}
