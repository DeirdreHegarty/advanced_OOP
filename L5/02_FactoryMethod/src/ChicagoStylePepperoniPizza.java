public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		// add topping to array list
		toppings.add("Sliced Pepperoni");
	}
	
	// I didn't remove cut method because chicago style = square slices
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
