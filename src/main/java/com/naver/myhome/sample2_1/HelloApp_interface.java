package com.naver.myhome.sample2_1;
/*
 	이 프로그램은 자바에서 일반적으로 볼 수 있는 코드입니다
 	HelloApp 클래스에서 MessageBeanEn 클래스를 직접 인스턴스를 생성하여 say 메서드를 호출하고 있습니다.
 	만약 MessageBeanEn 클래스가 변경되면 HelloApp 클래스는 영향을 받습니다.
 	이런 경우를 HelloApp 클래스가 MessageBeanEn 클래스를 강하게 의존하고 있다고 합니다.
 	==> 즉, 클래스 간의 의존관계, 결합상태가 강하다고 할 수 있습니다.
 */

/*
   만일 HelloApp 클래스에서 MessageBeanEn 클래스 대신 다른 클래스(MessageBeanKo)를 사용할 경우에 
   (MessageBeanKo 클래스는 MessageBeanEn 클래스와 같은 기능을 수행하는 메서드가 존재합니다.)
   이 클래스의 메서드는 MessageBeanEn 클래스의 메서드와 다른 이름으로 사용되고 있습니다.
   그래서 MessageBeanKo 클래스를 실행하기 위해서는 아래의 23-24라인 처럼 코드를 수정해야 합니다.
   이를 해결하기 위해 우선 이름이 같은 메서드를 사용하는 방법(다형성 이용)부터 사용해 보겠습니다.
 */

/*
 * 다형성 이용하기
 * 인터페이스를 이용하여 클래스 사이의 의존 관계를 약하게 설정하고 있습니다.
 * 
 * MessageBean 인터페이스의 상속을 받는 인스턴스들은 반드시 sayHello()메서드를 오버라이딩 하도록 해 두었기 때문에 
 * 인터페이스 MessageBean으로 선언한 레퍼런스 변수로 접근해서 메서드를 호출할 경우에는 코드를 수정하지 않아도 됩니다.
 * 하지만 MessageBeanKo 클래스를 MessageBeanEn 클래스로 변경해야 할 경우 주석 라인처럼 변경해야 합니다.
 * 즉, 참조하는 객체만 변경하면 됩니다.
 * 만약 방대한 어플리케이션일 경우 인스턴스 생성을 여러 곳에서 하고 있다면 변경할 코드의 양도 많아지게 됩니다.
 * 
 * */

public class HelloApp_interface {
	public static void main(String[] args) {
		MessageBeanEn bean = new MessageBeanEn();
		bean.sayHello("홍길동");
		
		/*
		 * MessageBeanKo bean2 = new MessageBeanKo(); bean2.sayHello("Spring");
		 */
	}
}
