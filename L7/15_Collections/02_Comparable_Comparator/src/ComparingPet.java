import java.util.*;
class Test{
  public static void main(String... args){
    Pet onesy = new Pet(1, "onesy");
    Pet twosy = new Pet(2, "twosy");
    Pet threesy = new Pet(3, "threesy");
    System.out.println("onsey compared to twosy: "+onesy.compareTo(twosy));
    List<Pet> l = new ArrayList<Pet>( Arrays.asList(new Pet[]{threesy, onesy, twosy}));
    System.out.println(l);
    Collections.sort(l);
    System.out.println(l);
    Collections.sort(l, new PetNameComparator() );
    System.out.println(l);
  }
}

class PetNameComparator implements Comparator<Pet>{
  public int compare(Pet petA, Pet petB){
    return petA.name.compareTo( petB.name );
  }
}
class Pet implements Comparable<Pet>{
  int age;
  String name;
  Pet(int a, String s){
    age = a;
    name = s;
  }
  public int compareTo(Pet p){
    if( (age == p.age) )
      return 0;					// 0 => same
    else if ( age > p.age)
      return 1;					// 1 => greater-than
    else
      return -1;				//-1 => less-than
  }
  public String toString(){
    return name+" "+age;
  }
}