//: holding/ListFeatures.java
// "\t\t..." comments added - where I have adapted the print outs
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class ListFeatures {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Pet> pets = Pets.arrayList(7);
    print("["+pets.getClass()+"]");																
	print("1: " + pets+"\t\t(result of: print(pets)");											
    Hamster h = new Hamster();
    pets.add(h); // Automatically resizes
    print("2: " + pets+"\t(result of: print(pets) after pets.add(h) {h = new Hamster()}");
    print("3: " + pets.contains(h) +"\t\t\t\t\t\t\t(result of: pets.contains(h:Hamster)");				
    pets.remove(h); // Remove by object
    Pet p = pets.get(2);
    print("4: " +  p + " " + pets.indexOf(p)+"\t\t\t\t\t\t(result of: p=pets.get(2) & pets.indexOf(p)");	
    Pet cymric = new Cymric();
    print("5: " + pets.indexOf(cymric)+"\t\t\t\t\t\t\t(result of: pets.indexOf(c:<<new>>Cymric)");		
    print("6: " + pets.remove(cymric)+"\t\t\t\t\t\t(result of: pets.remove(c:<<new>>Cymric)");			
    // Must be the exact object:
    print("7: " + pets.remove(p)+"\t\t\t\t\t\t\t(result of: pets.remove(p) //p = pets.get(2)");			
    print("8: " + pets+"\t\t\t(result of: print(pets)");										
    pets.add(3, new Mouse()); // Insert at an index
    print("9: " + pets+"\t\t(result of: print(pets) after pets.add(3, new Mouse()");
    List<Pet> sub = pets.subList(1, 4);
    print("subList: " + sub+"\t\t\t\t(result of printing: sub=pets.subList(1, 4)");
    print("10: " + pets.containsAll(sub)+"\t\t\t\t\t\t(result of: pets.containsAll(sub)");
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub+"\t\t\t(result of: print(sub) after Collections.sort(sub)");
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub)+"\t\t\t\t\t\t(result of: pets.containsAll(sub)");
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub+"\t\t\t(result of: Collections.shuffle(sub, rand): rand is new Random()");
	print("11: " + pets+"\t\t(result of: print(pets): after shuffled subList{backed-list pets effected)");
    print("12: " + pets.containsAll(sub)+"\t\t\t\t\t\t(result of: pets.containsAll(sub)");
	print("12: " + pets+"\t\t(result of: print(pets)");
    List<Pet> copy = new ArrayList<Pet>(pets);
    print("13: " + copy+"\t\t(result of: print(copy): copy = new ArrayList<Pet>(pets)");
	sub = Arrays.asList(pets.get(1), pets.get(4));
    print("sub: " + sub+"\t\t\t\t\t(result of: print(sub) now contains pets.get(1) & get(4)");
    copy.retainAll(sub);
    print("13: " + copy+"\t\t\t\t\t(result of: print(copy) after copy.retainAll(sub)");
	print("13: " + pets+"\t\t(result of: print(pets): changing copy with retainAll {copy was a deep-copy}");
    copy = new ArrayList<Pet>(pets); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy+"\t\t(result of: print(copy) after copy.remove(2)");
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy+"\t\t\t\t(result of: print(copy) after copy.removeAll(sub)");
    copy.set(1, new Mouse()); // Replace an element
    print("16: " + copy+"\t\t\t\t(result of: print(copy) after copy.set(1, new Mouse()");
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy+"\t\t(result of: print(copy) after copy.addAll(2, sub)");
    print("18: " + pets.isEmpty()+"\t\t\t\t\t\t(result of: pets.isEmpty()");
    pets.clear(); // Remove all elements
    print("19: " + pets+"\t\t\t\t\t\t\t(result of: print(pets) after pets.clear()");
    print("20: " + pets.isEmpty()+"\t\t\t\t\t\t(result of: pets.isEmpty() now");
    pets.addAll(Pets.arrayList(4));
    print("21: " + pets+"\t\t\t(result of: print(pets) after pets.addAll( randomArrayListofPets{size=4})");
    Object[] o = pets.toArray();
    print("22: " + o[3]+"\t\t\t\t\t\t(result of: o[3] after Object[] o = pets.toArray()");
    Pet[] pa = pets.toArray(new Pet[0]);
    print("23: " + pa[3].id()+"\t\t\t\t\t\t\t(result of: pa[3].id() after pa = pets.toArray(new Pet[0])");
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
