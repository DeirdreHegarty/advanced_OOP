import java.util.*;
class Cat{
	String name;
	Cat(String aCatName){ name = aCatName;}
}
class Dog{
	String name = "fido";
}

class AnimalShelter<T> {
  private List<T> animals;											//A List now to hold many
  public AnimalShelter() {animals = new ArrayList<T>();}
  public void add(T animal) { animals.add(animal); }
  public void add(List<T> allAnimals) { animals.addAll(allAnimals); }
  public void set(int index, T animal) { animals.set(index, animal); }
  public T get(int index) { return animals.get(index); }
  public int size(){ return animals.size(); }
}

class Test{
	public static void main(String[] args){
		List<Cat> someCats = Arrays.asList(new Cat[]{new Cat("tammy"), new Cat("fluffy")});
		AnimalShelter<Cat> shelterForCats = new AnimalShelter<Cat>();		
		shelterForCats.add( someCats );
		
		System.out.println("The Shelter contains: ");
		for(int i = 0; i < shelterForCats.size(); i++){
			System.out.println( shelterForCats.get(i));  //no cast: type safe AnimalShelter<Cat> ");
		}
	}
}