class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough(); //Thin crust is NY Style
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();  //Marinara sauce is NY Style
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese(); //Reggiano cheese is NY Style
	}
 
}
