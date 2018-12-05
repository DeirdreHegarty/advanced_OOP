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
		shelterForPets.add( new Cat("tammy") );								//Can add a Cat--|>Pet
		shelterForPets.add( new Dog("fido") );								//Can add a Dog--|>Pet
																			//	i.e.: type-safe over <Pet>'s
		
		System.out.println("The Shelter contains: ");
		for(int i = 0; i < shelterForPets.size(); i++){
			System.out.println( shelterForPets.get(i));  //no cast: type safe AnimalShelter<Cat> ");
		}
		
		/*
		for(Pet p: shelterForPets){						//'for each' syntax added in Java 1.5
			System.out.println(p);						//  :works provided the Collection (shelterForPets) implements Iterable
		}												//  See TASK above
		*/
	}
}