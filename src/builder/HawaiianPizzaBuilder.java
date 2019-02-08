package builder;

/*
ConcreteBuilder
	빌더 인터페이스 구현체. 부품을 합성하는 방식에 따라 여러 구현체를 만든다.
 */

public class HawaiianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
	}

}
