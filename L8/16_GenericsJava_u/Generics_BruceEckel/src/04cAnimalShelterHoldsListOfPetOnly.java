import java.util.*;
abstract class Pet{}											// [Pet]<|--{[Cat], [Dog]}
class Cat extends Pet{
	String name;
	Cat(String aCatName){ name = aCatName;}
}
class Dog extends Pet{
	String name;
	Dog(String aDogName){ name = aDogName;}}

class AnimalShelter<T>{
  private List<T> animals;											//A List now to hold many of type 'T'
  public AnimalShelter() {animals = new ArrayList<T>();}
  public void add(T animal) { animals.add(animal); }
  public void add(List<T> allAnimals) { animals.addAll(allAnimals); }
  public void set(int index, T animal) { animals.set(index, animal); }
  public T get(int index) { return animals.get(index); }
  public int size(){ return animals.size(); }
  //public Iterator<T> iterator(){ /*TASK: finish this*/}
}

class Test{
	public static void main(String[] args){
		AnimalShelter<Pet> shelterForPets = new AnimalShelter<Pet>();		//An AnimalShelter of 'Pet'
		List<Cat> someCats = Arrays.asList(new Cat[]{new Cat("tammy"), new Cat("fluffy")});
		shelterForPets.add(someCats);	//!CompileError
		//TASK: (1)Fix the code above so that you can pass 'someCats' to the method: 'add( :List<T> )' successfully
		//			TIP: you may need to use Arrays.<Pet>asList(...) //i.e. an "explicit type argument specification"
		//				http://stackoverflow.com/questions/4829631/unusual-generic-syntax-arrays-stringaslist
		//				also see: Bruce Eckel ...'/holding/AsListInterface.java'
		// 		(2) Briefly explain why the code didn't work 
		
		System.out.println("The Shelter contains: ");
		for(int i = 0; i < shelterForPets.size(); i++){
			System.out.println( shelterForPets.get(i));  //no cast: type safe AnimalShelter<Cat> ");
		}
		
	}
}