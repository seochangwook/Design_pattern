package builder;

/*
Builder Pattern
1) 정의
	복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴
A given type of pizza being constructed
 */

public class BuilderExample {
	public static void main(String args[]) {
		Cook cook = new Cook();
		
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
		
		Pizza pizza = cook.getPizza();
		
		System.out.println(pizza.toString());
	}
}
