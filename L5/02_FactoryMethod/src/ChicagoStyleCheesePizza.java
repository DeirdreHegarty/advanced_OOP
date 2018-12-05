public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
 	// I didn't remove cut method because chicago style = square slices
 	// but will have issues trying to call this is object in main 
 	// is of type pizza
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
