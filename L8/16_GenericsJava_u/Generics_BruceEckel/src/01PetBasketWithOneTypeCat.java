class Cat{
	String name = "tammy";
}
class PetBasket {
  private Cat anAnimal;												//Can hold one 'Cat' obj
  public PetBasket(Cat catToPutIn) { anAnimal = catToPutIn; }		//Defined in terms of 'Cat' only
  public void set(Cat catToPutIn) { anAnimal = catToPutIn; }		// i.e. Can't store a 'Dog'
  public Cat get() { return anAnimal; }
  public boolean equals(Cat obj) {
    return anAnimal.equals(obj);
  }	
}

class Test{
	public static void main(String[] args){
		Cat tammy = new Cat();
		PetBasket h = new PetBasket(tammy);
		//to get the thing...
		System.out.println( h.get() +"[Cat] obj - taken out of PetBasket h with get():Cat ");
	}
}