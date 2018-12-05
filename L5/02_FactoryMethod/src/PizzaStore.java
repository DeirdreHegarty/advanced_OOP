public abstract class PizzaStore { // <--------- abstract 

	/*
	 * Implemented method: refers to abstract method below
	 * which will be DEFINED BY SUB-CLASSES
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);	 // <------------- call to method in own class
		System.out.println("--- Making a " + pizza.getName() + " ---");
		return pizza;
	}
	/*
	 * ABSTRACT METHOD: to be defined by sub-class
	 */
	abstract Pizza createPizza(String item);  // <----------- abstract
}
