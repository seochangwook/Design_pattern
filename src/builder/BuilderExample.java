package builder;

/*
Builder Pattern
1) 정의
	복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴
A given type of pizza being constructed
Builder는 부품을 만들고, Director는 Builder가 만든 부품을 조합해 제품을 만든다.
 */

public class BuilderExample {
	public static void main(String args[]) {
		Cook cook = new Cook();
		
		//hawaiianPizza, spicyPizza를 만들 수 있는 빌더를 선언//
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		//Builder를 설정 후 만들려는 Pizza객체를 만든다.//
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
		
		//생성된 Pizza객체를 반환//
		Pizza hawaiianpizza = cook.getPizza();
		
		//Builder를 설정 후 만들려는 Pizza객체를 만든다.//
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
		
		//생성된 Pizza객체를 반환//
		Pizza spicypizza = cook.getPizza();
		
		System.out.println(hawaiianpizza.toString());
		System.out.println(spicypizza.toString());
	}
}
