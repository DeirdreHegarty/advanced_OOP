public class CheesePizza extends Pizza {
	 
	PizzaIngredientFactory ingredientFactory;

	// each CheesePizza gets passed a factory
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
 	// ingredients are retrieved from the factory unlike in the previous example for
 	// factory method where they are created inside the NYStyleCheesePizza class
	void prepare() {
		System.out.println("Preparing " + name);
		dough	= ingredientFactory.createDough();
		sauce	= ingredientFactory.createSauce();
		cheese 	= ingredientFactory.createCheese();
	}
}
