class PizzaTestDrive {
 
	public static void main(String[] args) {

		// I removed Chicago Pizza to make the submission less confusing
		// I only needed one NY Pizza to demonstrate Abstract Factory basics
		PizzaStore nyStore = new NYPizzaStore();
 
		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println( pizza1 );
 
	}
}