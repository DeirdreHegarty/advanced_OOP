## Different programming languages implement method-call to method definition (/implementation) binding differently. Compare C++ (static and dynamic) against Java (dynamic only).
* Be able to show a C++ virtual keyword example, with/without dynamic binding.
* Be able to explain by example why a destructor might need to be declared virtual.

---

## Compare C++ and Java with respect to how the object lifetime is managed in each language. Think here about, static, global, stack-local and heap as well as about object destruction or garbage collection, be able to show example codes where appropriate.

---

## Compare C++ and Java with respect to how a deep copy of an object can be achieved. Briefly explain the difference between a deep and shallow copy of an object in your answer. For C++, explain and show copy-constructor and copy assignment operator.

---

## Both the Java and C++ collection classes have Hashtable and Set data-structures. Compare how you write the code in each language. (E.g. operation1 {Java versus C++}, operation2 {Java versus C++}).


#### Hashtable (Java)

* It is similar to HashMap, but is synchronised.
* `void clear()` : method clears the hashtable so that it contains no keys.
* `Object clone()` :  for shallow copy of hashtable
* Has iterator
* `https://repl.it/@DeirdreHegarty/HashTable`

```java
// https://www.geeksforgeeks.org/hashtable-in-java/
import java.util.*; 
class Main { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable h = new Hashtable(); 
        Hashtable h1 = new Hashtable(); 

        h.put(3, "three"); 
        h.put(2, "two"); 
        h.put(1, "one"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable)h.clone(); 

        // checking clone h1 
        System.out.println("clone: " + h1); 

        h1.replace(3, "THREE");
        System.out.println(h1);

        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("clear: " + h); 
    } 
} 
```

#### Hashtable (C++)

* `https://repl.it/@DeirdreHegarty/HashtableUnorderedMap`

```cpp
#include <iostream>
#include <unordered_map>
#include <string>
 
int main()
{
  // Create an empty unordered_map
  std::unordered_map<int, std::string> wordMap;
 
  // Insert Few elements in map
  wordMap.insert( { 1,"First" });
  wordMap.insert( { 2, "Second" });
  wordMap.insert( { 3, "Third" });
 
  // Overwrite value of an element
  wordMap[3] = "THREE";
 
  std::cout << &wordMap << std::endl;
  // std::cout << wordMap << std::endl; // doesn't work

  // Iterate Over the unordered_map and display elements
  for (std::pair<int, std::string> element : wordMap)
    std::cout << element.first << " :: " << element.second << std::endl;
  
  wordMap.clear();
  
  return 0;
}
```

#### Set (Java)

* Cannot contain duplicate elements.
* Need to cast
* `https://repl.it/@DeirdreHegarty/Set`

```java
// https://www.tutorialspoint.com/java/java_set_interface.htm
import java.util.*;
public class Main {

  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> set = new HashSet<Integer>();
      try {
         for(int i = 0; i < 5; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

         TreeSet sortedSet = new TreeSet<Integer>(set);
         System.out.println("The sorted list is:");
         System.out.println(sortedSet);

         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
      }
      catch(Exception e) {}
   }
} 
```

#### Set (C++)

* cannot modify the elements using iterators
* if you modify the element value then internal data structure of std::set will get corrupt and it will not remain balanced binary search tree.
* 
* `https://repl.it/@DeirdreHegarty/SetC`

```cpp
#include<iostream>
#include<set>
#include<string>
int main()
{
  std::set<std::string> setOfNumbers;
 
  // Insert elements
  // they are sorted -> first second third
  setOfNumbers.insert("first");
  setOfNumbers.insert("second");
  setOfNumbers.insert("third");
  setOfNumbers.insert("third");
  setOfNumbers.insert("first");
  setOfNumbers.insert("first");
 
  // Only 3 elements will be inserted
  std::cout << "Set Size = " << setOfNumbers.size() << std::endl;
 
  // Iterate through all the elements in a set and display the value.
  for (std::set <std::string> :: iterator it=setOfNumbers.begin(); it!=setOfNumbers.end(); ++it)
      std::cout << ' ' << *it;
  std::cout<<"\n";
  return 0;
}
``` 

---

## Using Java code-examples, summarize the Exception mechanism. Be able to explain the advantages of using exceptions, and show how the Exception mechanism rules are effected when declaring sub-classes (i.e. when polymorphism takes effect).


The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.  

* The java.lang.Throwable class is the root class of Java Exception hierarchy which is inherited by two subclasses: 
  * Exception
  * Error
* According to Oracle, there are three types of exceptions:
  * Checked Exception
  * Unchecked Exception
  * Error

This applies to the Throwable class, which is the parent class to Exception. If a super class throws an Exception (let's say "Exception A"), the sub-classes can either throw the same Exception (Exception A) or Exceptions which are below the hierarchy with respect to Exception A.   


`https://way2java.com/exceptions/hierarchy-of-exceptions-checkedunchecked-exceptions/`

For example, IndexOutOfBoundsException is the superclass of StringIndexOutOfBoundException and ArrayIndexOutOfBoundsException.

If the superclass throws IndexOutOfBoundsException, its subclass(es) may either:

* throw IndexOutOfBoundsException,
* throw either StringIndexOutOfBoundException or ArrayIndexOutOfBoundsException, or
* throw no exception at all.

```java

// WILL compile
class Vehicle throws IndexOutOfBoundsException {
    // super class, do something...
}

class Sedan extends Vehicle throws IndexOutOfBoundsException {
    // sub-class of Vehicle, do something...
}

// WON'T COMPILE
class Vehicle throws IndexOutOfBoundsException {
    // super class, do something...
}

class Sedan extends Vehicle throws Exception {
    // subclass of Vehicle, do something...
}

```
The sub-class Sedan throws Exception which is "out of scope" from the super class's IndexOutOfBoundsException.

IndexOutOfBoundsException is not the super class Exception. It's the other way around. 


#### Checked Exception

The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

#### Unchecked Exception

The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

#### Error

Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.   


Java Exception Keywords:
* try
* catch
* finally
* throws
* throw

#### **Advantage 1:** Separating Error-Handling Code from "Regular" Code. 

The use of try/catch blocks segregates error-handling code and program code making it easier to identify the logical flow of a program. The logic in the program code does not include details of the actions to be performed when an exception occurs. Such details are present in the catch blocks.


#### **Advantage 2:** Propagating Errors Up the Call Stack.  

Java’s exception handling mechanism works in such a way that error reports are propagated up the call stack. This is because whenever an exception occurs, Java’s runtime environment checks the call stack backwards to identify methods that can catch the exception.

#### **Advantage 3:** Meaningful Error Reporting:

The exceptions thrown in a Java program are objects of a class. Since the Throwable class overrides the toString() method, you can obtain a description of an exception in the form of a string and display the description using a println() statement.

```java

catch (ArithmeticException e) {
       System.out.println("Exception occurred: " + e);
}

// would give following:
// Exception: java.lang.ArithmeticException: / by zero

```
#### **Advantage 4:** Grouping and Differentiating Error Types.  

Java provides several super classes and sub classes that group exceptions based on their type. While the super classes like IOException provide functionality to handle exceptions of a general type, sub classes like FileNotFoundException provide functionality to handle specific exception types.  

A method can catch and handle a specific exception type by using a sub class object.

For example, FileNotFoundException is a sub class that only handles a file not found exception. In case a method needs to handle multiple exceptions that are of the same group, you can specify an object of a super class in the method’s catch statement.


```java
try {  
    readFromFile("foo");  
    ...  
}   
catch ( FileNotFoundException e ) {  
    // Handle file not found  
    ...  
}   
catch ( IOException e ) {  
    // Handle read error  
    ...  
}   
catch ( Exception e ) {  
    // Handle all other errors  
    ...  
}
```

The catch clauses are evaluated in order, and the first possible (assignable) match is taken. At most, one catch clause is executed, which means that the exceptions should be listed from most specific to least. 

---

## What is the “deadly diamond of death”? Briefly explain using example C++ code and explain. Is this an issue in Java 8, briefly explain.

* In C++ can inherit from multiple classes - super would be ambiguous
* Ambiguous as to which parent class a particular feature is inherited from if more than one parent class implements said feature.
* Deadly diamond of death

The 'virtual' above means that only _one_ internal
 * Object is created. I.e. one virtual obj' is built from each of the 
 * derived classes

```cpp

// ISSUE with following (ambiguous)
// Notice how class D inherits from both B & C. 
// But both B & C inherit from A. That will result in 2 copies of the class A included.
class A {};
class B : public A {};
class C : public A {};
class D : public B, public C {};


// SOLUTION - USE VIRTUAL
// The 'virtual' above means that only _one_ internal
// Object is created. I.e. one virtual obj' is built from each of the 
// derived classes
class A {};
class B : virtual public A {};
class C : virtual public A {};
class D : public B, public C {};

``

Java 8 introduces default methods on interfaces. If A,B,C are interfaces, B,C can each provide a different implementation to an abstract method of A, causing the diamond problem. Either class D must reimplement the method (the body of which can simply forward the call to one of the super implementations), or the ambiguity will be rejected as a compile error. Prior to Java 8, Java was not subject to the Diamond problem risk because it did not support multiple inheritance.

```java
interface B {
    default void x() { System.out.println("B::x"); }
}

interface C {
    default void x() { System.out.println("C::x"); }
}

class D implements B, C {

  // will not compile without the following
  // SOLUTION TO DIAMOND PROBLEM:
    @Override
    public void x() {
        B.super.x();       // Note explicit interface names
        C.super.x();
    }

}

class Main {
  public static void main(String[] args) {
    D d = new D();
    d.x();
  }
}
```


---

## Compare and contrast generic types in Java against C++ Template types.


`https://stackoverflow.com/questions/36347/what-are-the-differences-between-generic-types-in-c-and-java`  

c++:
* templates create new types
* Templates work, as the name implies, by providing the compiler with a template that it can use to generate type-safe code by filling in the template parameters.
* templates are a compile-time construct which give you a way to modify the language to suit your needs.
* Allows the use of primitive type arguments in generics.
* `https://repl.it/@DeirdreHegarty/Generics`

```cpp
#include <iostream>
#include <string>

//template
// function will return the max of two variables
template <typename T>
inline T const& Max (T const& a, T const& b) { 
   return a < b ? b:a; 
}

int main () {
   int i = 39;
   int j = 20;
   std::cout << "Max(i, j): " << Max(i, j) << std::endl; 

   double f1 = 13.5; 
   double f2 = 20.7; 
   std::cout << "Max(f1, f2): " << Max(f1, f2) << std::endl; 

   std::string s1 = "Hello"; 
   std::string s2 = "World"; 
   std::cout << "Max(s1, s2): " << Max(s1, s2) << std::endl; 

   return 0;
}
```

java:
* generics restricts existing types.
* Generics work the other way around: the type parameters are used by the compiler to verify that the code using them is type-safe, but the resulting code is generated without types at all.
* a simple run-time type substitution mechanism. 
* Java does not allow the use of primitive type arguments in generics.
* `https://repl.it/@DeirdreHegarty/Generics`  

```cpp
class Main {
   // determines the largest of two Comparable objects
   
   public static <T extends Comparable<T>> T maximum(T x, T y) {
      T max = x.compareTo(y) > 0 ? x : y; 
      return max;  
   }
   
   public static void main(String args[]) {
      System.out.println(maximum( 3, 4));
      System.out.println(maximum( 6.6, 8.8));
      System.out.println(maximum("apple", "orange"));
   }
}
```

