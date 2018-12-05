class Cat{
	String name = "tammy";
}
class Dog{									
	String name = "fido";
}

class PetBasket {								//A generic PetBasket
  private Object value;							//Can hold any 'Object' now
  public PetBasket(Object val) { value = val; }	//Defined in terms of 'Object'
  public void set(Object val) { value = val; }	//	i.e. can store Cat/Dog ...? extends Object now;-)
  public Object get() { return value; }
  public boolean equals(Object obj) {
    return value.equals(obj);
  }	
}

class Test{
	public static void main(String[] args){
		Cat tammy = new Cat();
		PetBasket basket = new PetBasket(tammy);		//Can still add a [Cat]--|>[Object]
		//But now - to get the thing...
		// (Cat)basket.get();							//...need to cast from Object to Cat! :-(
		
		System.out.println( (Cat)basket.get()  +"\t[Cat] obj - taken out of PetBasket: (Cat) cast required ");
	//Now we can add any object: {Thing, Cat, Dog etc.}
	//	- but on retreival you need to know the type and cast accordingly
	//*
		basket.set( new Dog() );
		System.out.println( (Dog)basket.get() +"\t[Dog] obj - taken out of PetBasket: (Dog) cast required ");
	//*/
	}
}