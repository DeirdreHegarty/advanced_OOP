abstract class PizzaStore {
	PizzaIngredientFactory ingredientFactory;
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		
		return pizza;
	}

	protected abstract Pizza createPizza(String item);

}
