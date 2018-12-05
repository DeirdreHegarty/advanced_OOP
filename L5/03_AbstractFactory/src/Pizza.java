abstract class Pizza {
	PizzaIngredientFactory ingredientFactory;
	String name;

	Dough dough;
	Sauce sauce;
	Cheese cheese;

	// prepare is abstract to collect ingredients from factory
	abstract void prepare();

	
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		return result.toString();
	}
}
