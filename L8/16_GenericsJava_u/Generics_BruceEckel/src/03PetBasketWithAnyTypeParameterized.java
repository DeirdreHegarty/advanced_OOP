class Cat{
	String name = "tammy";
}
class Dog{									
	String name = "fido";
}

class PetBasket<T> {
  private T value;							//Can hold any 'T' now
  public PetBasket(T val) { value = val; }	//Defined in terms of 'T'
  public void set(T val) { value = val; }	//	i.e. can store Cat/Dog ...? extends T now;-)
  public T get() { return value; }
  public boolean equals(Object obj) {		//TASK: Change the parameter type of obj to 'T' and explain the compile error
    return value.equals(obj);
  }	
}

class Test{
	public static void main(String[] args){
		Cat tammy = new Cat();
		PetBasket<Cat> basket = new PetBasket<>(tammy);		//Can still add a [Cat]--|>[T]
		//But now - to get the thing...
		System.out.println(basket.getClass());
		Cat returned = basket.get();						//...no need to cast now: type-safe over <Cat> :-)
		
		System.out.println( returned  +"\t[Cat] obj - taken out of PetBasket<Cat>: no cast required ");
	
	}
}