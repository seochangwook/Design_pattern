package builder;

/*
Abstract Builder 
	빌더 인터페이스
 */

abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
