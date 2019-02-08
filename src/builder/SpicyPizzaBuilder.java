package builder;

/*
ConcreteBuilder
	빌더 인터페이스 구현체. 부품을 합성하는 방식에 따라 여러 구현체를 만든다.
 */

public class SpicyPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}

}
