package prototype;

/*
Prototype Pattern
1) 정의
	생성할 객체들의 타입이 프로토타입인 인스턴스로부터 결정되도록 하며, 인스턴스는 새 객체를 만들기 위해 자신을 복제한다.
	
	* 프로토타입 패턴은 추상 팩토리 패턴과는 반대로, 클라이언트 응용 프로그램 코드 내에서 객체 창조자(creator)를 서브클래스(subclass)
	  하는 것을 피할 수 있게 해준다. 
	* 프로토타입 패턴은 새로운 객체는 일반적인 방법으로 객체를 생성하는(new 이용) 고유의 비용이 주어진 응용프로그램 상황에 있어서 불가피하게 
	  매우 클때, 이 비용을 감내하지 않을 수 있게 해준다. 비용절감을 할 수 있다. ==> 객체 생성에 대한 비용절감
	  
패턴 구현 시 우선 clone() 메소드를 선언하는 추상 베이스 클래스를 하나 만든다. 다형적 생성자 기능이 필요한 클래스가 있다면, 그것을 앞에서 만든
클래스를 상속받게 한 후 clone() 메소드 내의 코드를 구현한다.
 */

public class PrototypeExample {
	public static void main(String args[]) {
		Cookie tempCookie = null;
		Cookie prot = new CocountCookie();
		
		CookieMachine cm = new CookieMachine(prot);
		
		//동일한 객체를 new연산을 이용해서 생성하는 하는 것이 아닌 복제방식을 이용하여 저비용으로 관리가능//
		for(int i=0; i<100; i++) {
			tempCookie = cm.makeCookie();
			
			tempCookie.setName("seochangwook"+i);
			
			System.out.println("["+i+"] : " + tempCookie.toString() + ", hashcode: " + tempCookie.hashCode());
		}
	}
}
