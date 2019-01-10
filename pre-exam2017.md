## What is the purpose of the virtual keyword when declaring a C++ function? Write example code that demonstrates the effect of the virtual keyword (what it achieves). Briefly explain your answer.  

* A virtual function makes its class a polymorphic base class.
* Derived classes can override virtual functions. 
* They are mainly used to achieve Runtime polymorphism.
* The resolving of function call is done at Run-time.
* Making even one method 'pure virtual' means the class is abstract and so cannot be instantiated.


The concept of the virtual function solves the following problem:

In object-oriented programming, when a derived class inherits from a base class, an object of the derived class may be referred to via a pointer or reference of the base class type instead of the derived class type. If there are base class methods overridden by the derived class, the method actually called by such a reference or pointer can be bound either 'early' (by the compiler), according to the declared type of the pointer or reference, or 'late' (i.e., by the runtime system of the language), according to the actual type of the object referred to.

Virtual functions are resolved 'late'. If the function in question is 'virtual' in the base class, the most-derived class's implementation of the function is called according to the actual type of the object referred to, regardless of the declared type of the pointer or reference. If it is not 'virtual', the method is resolved 'early' and the function called is selected according to the declared type of the pointer or reference.

Virtual functions allow a program to call methods that don't necessarily even exist at the moment the code is compiled.

In C++, virtual methods are declared by prepending the virtual keyword to the function's declaration in the base class. This modifier is inherited by all implementations of that method in derived classes, meaning that they can continue to over-ride each other and be late-bound. And even if methods owned by the base class call the virtual method, they will instead be calling the derived method. Overloading occurs when two or more methods in one class have the same method name but different parameters. Overriding means having two methods with the same method name and parameters. Overloading is also referred to as dynamic function mapping and overriding as function matching.

*VIRTUAL EXAMPLE*


```cpp

// header file

class Animal {
public:
    void move();
    virtual void eat() = 0;
};

class Llama : public Animal {
  public:
      void eat(); 
};
class Rabbit : public Animal {
  public:
      void eat(); 
};

// animal
#include <iostream>
#include "animal.h"

void Animal :: move() { 
    std::cout << "This animal moves in some way" << std::endl; 
}

void Llama ::eat(){ 
    std::cout << "Llamas eat grass!" << std::endl; 
}

void Rabbit ::eat(){ 
    std::cout << "Rabbits eat lettuce!" << std::endl; 
}

// main
#include <iostream>
#include "animal.h"

int main() {
Animal *a = new Llama();
a->eat();
a->move();

Animal *b = new Rabbit();
b->eat();
b->move();

//Animal *c = new Animal(); // this will cause error
}

```


*ROB PURE VIRTUAL EXAMPLE:*

```cpp
// header file
class A
{
	public:
		A();		
		virtual void doX() = 0;	  //"pure virtual" function
};							    

class B : public A
{
	public:
		B();
		void doX();		
};

// cpp file
#include <iostream>
#include "Abstract.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}
	
	B::B(){
		cout<< "B()" <<endl;
	}
		
	void B::doX(){
		cout<< "B::doX()" <<endl;
		
	}

// main
#include <iostream>
#include "Abstract.h"			
using namespace std;

int main(){
	//compile-error: class A is now abstract
	A *a = new B();   //'...new A();' won't work because A is abstract		
	a->doX();			
}
```

---

## Write a C++ code sample that includes a virtual destructor for class Animal and explain why it might need to be declared virtual.  

* Virtual destructors are useful when you might potentially delete an instance of a derived class through a pointer to base class.
* Should always make base classes' destructors virtual when they're meant to be manipulated polymorphically.
* classes not designed to be base classes or not designed to be used polymorphically should not declare virtual destructors.

Deleting a derived class object using a pointer to a base class that has a non-virtual destructor results in undefined behavior. To correct this situation, the base class should be defined with a virtual destructor.

`https://repl.it/@DeirdreHegarty/VirtualFunction`   

```cpp

//header
class Animal {
public:
    void move();
    virtual void eat() = 0;
    virtual ~Animal();				// <- virtual destructor
};

class Llama : public Animal {
  public:
      ~Llama();
      void eat(); 
};

// cpp file
#include <iostream>
#include "animal.h"

void Animal :: move() { 
    std::cout << "This animal moves in some way" << std::endl; 
}
Animal :: ~Animal() { 
    std::cout << "Destructing Animal Base" << std::endl; 
}

void Llama ::eat(){ 
    std::cout << "Llamas eat grass!" << std::endl; 
}
Llama :: ~Llama() { 
    std::cout << "Destructing LLama Base" << std::endl; 
}


// main
#include <iostream>
#include "animal.h"

int main() {
Animal *a = new Llama();
a->eat();
a->move();


// destructor not virtual base will return
// 'Destructing Animal Base' ONLY!!

// destructor with virtual base will return:
// Destructing LLama Base
// Destructing Animal Base
delete a;

}
```

---

## In C++ there is no super keyword (as in Java). Briefly explain why this has to be. Give an example of a C++ situation where the concept of super would make no sense.  

* In C++ can inherit from multiple classes - super would be ambiguous
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

```

---

## Write a definition for the function start() of class RaceCar such that it re-uses the code in the start()function of class Car (i.e. its base-class).

`https://repl.it/@DeirdreHegarty/UseBaseClassFunction?language=cpp`  

```cpp

// header 
class Car{
  public:
    void start();
};
class RaceCar : public Car{
  public:
    void start();
};

// car.cpp
#include <iostream>
#include "Car.h"

void Car :: start(){
std::cout << "Starting Car" << std::endl; 
}

void RaceCar :: start(){
std::cout << "Starting RaceCar" << std::endl; 
}

// main
#include <iostream>
#include "Car.h"

int main() {
  // Starting Car
  Car *c = new Car();
  c->start();

  // Starting Car (re-use of base)
  Car *rc = new RaceCar();
  rc->start();
  
  // Starting RaceCar
  RaceCar *crc = new RaceCar();
  crc->start();
}

```

---

## Write a C++ copy constructor, and give a short C++ code sample to show a copy assignment operator being used.

```cpp

#include<iostream> 
  
class Num 
{ 
private: 
    int x; 
public: 
    Num(int xin) { 
      x = xin;  
    } 
  
    // Copy constructor 
    Num(const Num &p2) {
      std::cout << "Copy Constructor" << std::endl;
      x = p2.x; 
    } 
  
    int getX(){  return x; } 
}; 

// Copy constructor: 
// called when a new object is created from an existing object, 
// as a copy of the existing object.

// Assignment operator: 
// called when an already initialized object is assigned a 
// new value from another existing object.


int main() 
{ 
    Num p1(10);   // Normal constructor is called here 
    Num p2 = p1;  // Copy constructor is called here 
  
    // Let us access values assigned by constructors 
    std::cout << "p1 = " << p1.getX() << std::endl; 
    std::cout << "p2 = " << p2.getX() << std::endl; 

    Num p3(12); // Normal constructor is called here 
    p3 = p1;    // assignment operator called here
  
    return 0; 
}

```

---

## Compare C++ and Java with respect to how a deep copy of an object can be achieved. Briefly explain the difference between a deep and shallow copy of an object in your answer. For C++, explain and show copy-constructor and copy assignment operator.



```java
//java
public class Person {
    private String firstName;
    private String lastName;

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
    }
    ...
}
```

---

## Both the Java and C++ collection classes similar data-structures. Choose any two and compare how you write the code in each language. (E.g. operation1 {Java versus C++}, operation2 {Java versus C++}).

---

## Give an example that explains how the use of the clone() method in Java can result in a shallow copy of an object. Compare the Java and C++ languages in this respect.

* The default implementation of Object.clone() performs a shallow copy
* When a class desires a deep copy or some other custom behavior, they must implement that in their own clone() method after they obtain the copy from the superclass.
* One disadvantage with the design of the clone() method is that the return type of clone() is Object
* needs to be explicitly cast back into the appropriate type

*Shallow copy is method of copying an object and is followed by default in cloning. In this method the fields of an old object X are copied to the new object Y. While copying the object type field the reference is copied to Y i.e object Y will point to same location as pointed out by X. If the field value is a primitive type it copies the value of the primitive type.* 

```java
// https://www.geeksforgeeks.org/clone-method-in-java-2/
// A Java program to demonstrate shallow copy 
// using clone() 
import java.util.ArrayList; 
  
// An object reference of this class is 
// contained by Test2 
class Test 
{ 
    int x, y; 
} 
  
// Contains a reference of Test and implements 
// clone with shallow copy. 
class Test2 implements Cloneable 
{ 
    int a; 
    int b; 
    Test c = new Test(); 
    public Object clone() throws CloneNotSupportedException 
    { 
       
       Test2 t = (Test2) super.clone(); 
       // Assign the shallow copy to new refernce variable t
       //  t.c = new Test();                 // <- this line makes it a deep copy
       return t;
    } 
} 
  
// Driver class 
public class Main 
{ 
    public static void main(String args[]) throws CloneNotSupportedException 
    { 
       Test2 t1 = new Test2(); 
       t1.a = 10; 
       t1.b = 20; 
       t1.c.x = 30; 
       t1.c.y = 40; 
  
       Test2 t2 = (Test2)t1.clone(); 
  
       // Creating a copy of object t1 and passing 
       //  it to t2 
       t2.a = 100; 
  
       // Change in primitive type of t2 will not 
       // be reflected in t1 field 
       t2.c.x = 300; 
  
       // Change in object type field will be 
       // reflected in both t2 and t1(shallow copy) 
       System.out.println(t1.a + " " + t1.b + " " + 
                          t1.c.x + " " + t1.c.y); 
       System.out.println(t2.a + " " + t2.b + " " + 
                          t2.c.x + " " + t2.c.y); 
    } 
} 

```

---

## What is the “deadly diamond of death”? Briefly explain using example C++ code and explain. Is this an issue in Java 8, briefly explain.

The Diamond Problem or the "deadly diamond of death" is the generally used term for an ambiguity that arises when two classes B and C inherit from a superclass A, and another class D inherits from both B and C.

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
```

Java 8 introduces default methods on interfaces. If A,B,C are interfaces, B,C can each provide a different implementation to an abstract method of A, causing the diamond problem. Either class D must reimplement the method (the body of which can simply forward the call to one of the super implementations), or the ambiguity will be rejected as a compile error. 

* Prior to Java 8, Java was not subject to the Diamond problem risk because it did not support multiple inheritance.

```java

//Diamond.java
interface Interface1 {
    default public void foo() { System.out.println("Interface1's foo"); }
}
interface Interface2 {
    default public void foo() { System.out.println("Interface2's foo"); }
}
public class Diamond implements Interface1, Interface2 {
    public static void main(String []args) {
        new Diamond().foo();
    }
}

```

---

## Compare and contrast generic types in Java against C++ Template types. Write one Java generic class definition and one C++ template class definition and briefly compare and contrast both language mechanisms.

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
* `https://repl.it/@DeirdreHegarty/IdolizedMellowIntelligence`  

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

