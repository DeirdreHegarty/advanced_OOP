## Question 1

```java

// **2016_Q1**
// Given the code:
/*1.*/ class Violin{
/*2.*/ void play(){
/*3.*/ System.out.println(“play normal”);
/*4.*/ //… code here
/*5.*/ }
/*6.*/ }

```

* `https://repl.it/@DeirdreHegarty/Violin`

**2016_Q1**(a) If a subclass defines the same method as a superclass (i.e. with
		exactly the same method signature) – what is this typically
		referred to as?  

This is `method overriding`.
* The argument list should be exactly the same as that of the overridden method.
* The return type should be the same or a subtype of the return type declared in the original overridden method in the super class.
* In Java, a method signature is part of the method declaration. It's the combination of the method name and the parameter list.

If two methods of a class (whether both declared in the same class, or both inherited by a class, or one declared and one inherited) have the same name but signatures that are not override-equivalent, then the method name is said to be overloaded.  

**2016_Q1**(b) Define a subclass called ClassicViolin that has a method
		called play(). Write that method to re-use the code in the
		Violin superclass and then add its own specialized code.   
```java
class ClassicViolin extends Violin{
  void play(){
	  super.play();
	  System.out.println("play classically");
  }
}
```
 
**2016_Q1**(c) Suppose there is a class called ElectricViolin that is a
		subclass of the Violin class above:    

![diagram for 2016 q1](/Users/deirdre/Desktop/2016q1.png)

		Further suppose a client-programmer writes the following code:  

```java
Violin v = new ElectricViolin();
v.tune();
```

**2016_Q1**(c)(i) What would be the result of trying to compile and execute
		these statements? Explain your answer.  

`error: cannot find symbol e1.tune();` - This is because v is a Violin type object that is trying to access methods inside an ElectricViolin type. `tune()` is not part of the Violin type and therefore cannot be referenced.

**2016_Q1**(c)(ii) Write example-code showing how instanceof could be
		used to call the tune() method in this case. Explain the
		code.  

The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
```java
final void tune(){
	if (this instanceof ElectricViolin){
	  System.out.println("tune ElectricViolin");
	}else if (this instanceof ClassicViolin){
	   System.out.println("tune ClassicViolin");
	}
	System.out.println("tune violin");
}
```

**2016_Q1**(c)(iii)What is the Liskov Substitution Principle? State whether
		using instanceof supports or violates this principle. 

*Liskov Substitution Principle:* Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.  


**2016_Q1**(d) Suppose there was a requirement that tune()should work the
		same for all subclasses but each subclass should implement
		display()differently.  


**2016_Q1**(d)(i) Write example code showing how this could be achieved
		with maximum code re-use.  

```java
class Violin{
  void play(){
  System.out.println("play normal");
  }
  final void tune(){
  System.out.println("tune violin");
  }
  String display(){
    return "Display violin";
  }
}
class ClassicViolin extends Violin{
  void play(){
    super.play();
    System.out.println("play classically");
  }
   String display(){
    return "Display ClassicViolin";
    }
}
class ElectricViolin extends Violin{
  void play(){
    super.play();
    System.out.println("play electrically");
  }
  String display(){
    return "Display ElectricVoilin";
  }
}
```

**2016_Q1**(d)(ii) Write a polymorphic method that could accept any
		subclass of Violin and call tune() and display().  

```java
  static void polyMethod(Violin v){
    v.tune();
    System.out.println(v.display());
  }
```

**2016_Q1**(d)(iii) What would be the effect of defining tune()to be final
		in this case?  

Final methods can not be overridden : If we don’t want a method to be overridden, we declare it as final.  

During inheritance, we must declare methods with final keyword for which we required to follow the same implementation throughout all the derived classes. Note that it is not necessary to declare final methods in the initial stage of inheritance(base class always). We can declare final method in any subclass for which we want that if any other class extends this subclass, then it must follow same implementation of the method as in the that subclass.

---

**2017_Q1**

```java
// **2017_Q1** 
//Assuming the following declaration for an abstract class Person
//is error-free:

/*1.*/ abstract class Person{
/*2.*/ private Brain brain;
/*3.*/ Person(Brain humanBrain){
/*4.*/ brain = humanBrain;
/*5.*/ }
/*6.*/ }

```

**2017_Q1**(a) Identify the issue with each of the following code samples and
		briefly explain each:  

```java
/* **2017_Q1**(a)(i) */ 
Person p = new Person( new Brain() );

/* **2017_Q1**(a)(ii) */ 
class Politician extends Person{
 Politician(){ }
}

```
**2017_Q1**(a)(i)  
`Person p = new Person( new Brain() );` - `Person` is abstract. This means that the class cannot be instantiated. It can however be subclasses. Also, passing `new Brain()` as a argument in the client code is not good practice.


**2017_Q1**(a)(ii) 
The constructor for Policician does not accept `Brain` as a parameter. This will cause an error as compile time. 

**2017_Q1**(b)Could the above abstract class definition for Person be used to
		implement a composition relationship between the classes
		Person and Brain? Explain using code samples.  

Java composition is achieved by using instance variables that refers to other objects. For example, a Person has a Brain. Composition in java is the design technique to implement has-a relationship in classes. We can use java inheritance or Object composition in java for code reuse.  

```java
class Person{
  private Brain brain;
  Person(){
  System.out.print("Person has a ");
  brain = new Brain();
  }
}
```

**2017_Q1**(c) Give an example of a factory method design pattern (any
		example of your choosing) and ...   

**2017_Q1**(c)(i)   clearly identify the factory method in your example.   

**2017_Q1**(c)(ii)  provide a full sample-code.   

`https://github.com/DeirdreHegarty/advanced_OOP/blob/master/L5/Factory_Patterns.md#factory-method`   

Factory Method:  

* Defines an interface for creating objects, but let subclasses to decide which class to instantiate
* Refers the newly created object through a common interface.

> The Factory Method Pattern defines an interface for creating an object, 
> but lets subclasses decide which class to instantiate. 
> 
> Factory Method lets a class defer instantiation to subclasses.

```java

class Main {
  public static void main(String[] args) {
    PizzaGetter pg = new DeluxePizzaGetter();
    Pizza p = pg.getPizza();
    System.out.println(p);
 }
}

// Factory Method Pattern
abstract class PizzaGetter{
  Pizza getPizza(){
    return subclassMakePizza();//abs below 
  }
  // factory method
  abstract Pizza subclassMakePizza(); // <---- factory method
}

class DeluxePizzaGetter extends PizzaGetter{
  Pizza subclassMakePizza(){		  // <---- factory method
    return new DeluxeCheese();
  }
}

class Pizza{
  String toppings;
}

class CheesePizza extends Pizza{
  CheesePizza(){
    toppings = "cheese";
  }
}

class DeluxeCheese extends CheesePizza{
  DeluxeCheese(){
    toppings = " lots of cheese!";
  }
}

//  returns:
//  DeluxeCheese@001

```


**2017_Q1**(c)(iii) explain the role of polymorphism in the pattern. 

With Factory Method you are creating a framework that let’s the subclasses decide which implementation will be used.

For example, the subclassMakePizza() method in the Factory Method provides a general framework for creating pizzas that relies on a factory method to actually create the concrete classes that go into making a pizza. By subclassing the DeluxaPizzaGetter class, you decide what concrete products go into making the pizza that subclassMakePizza() returns.   

**2017_Q1**(c)(iv)  state and explain whether an abstract class or interface
				(or either) is needed to implement the pattern. 

Either an abstract class or interface may be used. Reasons above.

**2018_Q1**
Assuming the following declaration for a class ClassicFiddle
is error-free and that the import is needed:

```java

/*1.*/ package classic;
/*2.*/ import instruments.Fiddle;
/*3.*/ class ClassicFiddle extends Fiddle{
/*4.*/  public void playSweetly(){
/*5.*/  play();
/*6.*/  }
/*7.*/ }

```

**2018_Q1**(a) What can you determine about the class Fiddle (not shown):

* Fiddle is in the package instruments
* Fiddle is public
* Fiddle is a superclass

**2018_Q1**(a)(i) 
		Identify a member of the class Fiddle, and briefly
		explain how you know this member exists.  

```java
  public void playSweetly(){
    play(); //<- memeber of Fiddle
  }
```

This shows that `play()` is a memebr of Fiddle. `super.play();` 

**2018_Q1**(a)(ii) 
		State the access modifier that the member must have,
		and say how you know this to be the case.    

This must be `public` because it is in a different package and a subclass can access meaning it is not `protected`.

**2018_Q1**(b)
		Could the following class declaration be valid for Fiddle?  
		```java
		 class Fiddle{ …
		 ```
		(You can assume it would be within a file called Fiddle.java).  

No, it needs to be `public class Fiddle{ ...`. When a class is declared with the public keyword, it means this class is accessible and visible to all the classes in all the packages in Java. Out of all the other access modifiers, public access modifier gives the class a maximum visiblity to a class.  

**2018_Q1**(c) Assume the following code, and only the following code,exists in
		a file called Runner.java:  

```java

/*1.*/ class Runner{
/*2.*/ public static void main(String[] args){
/*3.*/ ClassicFiddle cf = new ClassicFiddle();
/*4.*/ cf.play();
/*5.*/ }
/*6.*/ }

```


**2018_Q1**(c)(i) Would the class Runner compile? State why/why-not?

No:

* ClassicFiddle may not exist
* ClassicFiddle is on another package, which has not been imported.

**2018_Q1**(c)(ii) If you were not allowed to add code to the class
		Runner, but could change ClassicFiddle - state
		how you could get this to compile, and explain how it
		would work.  

* add import for packages classic and instruments
* remove ClassicFiddle from package classic (so runner cam access is)
* make ClassicFiddle public
* make Fiddle public and remove from its package

**2018_Q1**(c)(iii) If you could only change the code in the class Runner –
		state how you could get this to compile and explain how it
		would work.  

* import classic package
* import instrument package

**2018_Q1**(c)(iv) Given that the following package structure is required:  

		* exec.Runner
		* instruments.Fiddle: 
		* instruments.classic.ClassicFiddle

		Write a full code example such that the code would
		compile and execute without error. (Note: You can use
		empty method bodies but include all necessary accessmodifiers; 
		no explanation is required.)    
`https://repl.it/@DeirdreHegarty/Violin`

---

## Question 2

**2018_Q2**(a) Give an example (in code or UML) of an abstract-factory design
		pattern (any example of your choosing). In your example….  

		(i) clearly identify a factory-method, and state the
		relationship between the factory-method and abstract
		factory patterns.  

		(ii) provide a full sample-code example.  

		(iii) explain the role of an abstract-class in the pattern.  

		(iv) comparing the factory-method against the abstractfactory: 
		briefly discuss the difference in intent and applicability of 
		the two patterns.  

**2018_Q2**(b) Give an example (in code or UML) of a singleton design pattern.
		(i) Briefly identify what the pattern is intended to achieve.  

Intention:  
* Ensure that only one instance of a class is created.
* Provide a global point of access to the object.

The singleton pattern is one of the simplest design patterns: it involves only one class which is responsible to instantiate itself, to make sure it creates not more than one instance; in the same time it provides a global point of access to that instance. In this case the same instance can be used from everywhere, being impossible to invoke directly the constructor each time.  

OPTION 2 in `https://github.com/DeirdreHegarty/advanced_OOP/blob/master/L4/L4.md`  

```java
// THREADSAFE (synchronized)
public class Singleton {

    private static volatile Singleton instance = null; 	// 1

    private Singleton() {} 								// 4

    public static Singleton getInstance() { 			// 2
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); 		// 3
                }
            }
        }

        return instance;
    }
}
```

		(ii) Outline five characteristics you would expect to see in
		code for a singleton-pattern implementation (i.e. about the
		constructor, a method you’d expect to see… etc.).  

* Make constructor as private.
* Write a static method that has return type object of this singleton class. 

1) Define a private static attribute in the "single instance" class.
2) Define a public static accessor function in the class.
3) Do "lazy initialization" (creation on first use) in the accessor function.
4) Define all constructors to be protected or private.
5) Clients may only use the accessor function to manipulate the Singleton.


		(iii) State and briefly explain why a programmer might need to
		be careful when implementing a singleton in a multithreaded 
		environment. 
		
* bottleneck
* allowing access simultaneously before a thread is finished

The following is NOT thread safe:

```java
public class Singleton {
    private static Singleton _instance = null;
     
    private Singleton() {}
     
    public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
         
        return _instance;
    }
}
```
1) Thread-1 enters getInstance() for the first time and sees that _instance is null and thus the condition is true.
2) Before instantiating the object a thread switch occur.
3) Thread-2 enters getInstance() and it will see _instance null too, as the instantiation by Thread-1 is not completed yet.
4) Thread-2 instantiate new object and then return.
5) Thread-1 knows nothing about Thread-2. So when it gets its turn again, it instantiates another object and returns that. At this point we have two instances of Singleton which violates the fundamental purpose of the pattern.

Also, the following would cause a bottleneck - method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously:  

```java
public class Singleton {
    private static Singleton _instance = null;
     
    private Singleton() {}
	synchronized public static Singleton getInstance(){
		System.out.println("SYNCHRONIZED METHOD");
		if(_real == null)
		{
			_real = new new Singleton(); 
		}	
		return _real; //return instance that already has been set
	}
}
```

**2017_Q2**

```java
// **2017** Q2 JAVA
// CodeSender.java 
/*1.*/ 	class CodeSender{
/*2.*/ 		Person friend;
/*3.*/ 			void setFriend(Person x){
/*4.*/ 			 friend = x;
/*5.*/ 		}
/*6.*/ 		void update(int newX ){
/*7.*/ 		 friend.setCode( newX );
/*8.*/ 		}
/*9.*/ 	}
/*10.*/
```

```c++
// **2017** Q2 JAVA
// Person.java
/*1.*/ 	class Person{
/*2.*/ 		int code;
/*3.*/ 		void setCode(int new){
/*4.*/ 			code = new;
/*5.*/ 		}
/*6.*/ 	}
/*7.*/ 		
/*8.*/ 			
/*9.*/ 			
/*10.*/
```

		Requirements: Suppose the CodeSender needs to maintain a
		list of Person objects (of any size), such that when
		update(:int) is invoked to set a new code, all people on the
		list are updated. Further suppose that each instance of Person
		should have the ability to subscribe or unsubscribe to the
		update.  

**2017_Q2**(a) Clearly state the common name for a design pattern you have
		studied which would be suitable for the above requirements.   

The Strategy Pattern.

**2017_Q2**(b) With respect to Object Oriented programming - what is meant by
		the terms “call-back”, “push” and “pull”. Give brief code
		examples and explain.  

**call-back :** CallBack Function is a function which passed into another function as an argument and is expected to execute after some kind of event. The purpose of the callback is to inform a class Sync/Async if some work in other class is done. This is very useful when working with Asynchronous tasks. Suppose we want to perform some routine tasks like perform some operation or display content after some clicking a button, or fetching data from internet. This is also used in event handling, as we get notified when a button clicked via callback function.  

**push :**
**pull :**

**2017_Q2**(c) Briefly explain what is meant by the “open/closed” principle.
		Explain the principle with respect to your answer to the pattern
		you identified in part (a) of this question if possible.
		(Alternatively – refer to any design pattern which you feel
		adheres to the principle).  

Open/Close principle = we should strive to write code that doesn’t have to be changed every time the requirements change. Software entities should be open to extension but closed to modification.   

* Open to Extension
* But Closed for Modification
* Via the strategy pattern, you encapsulate some specific strategies and select which one to use at runtime according to some criteria. So, by definition, using this pattern makes your code open to extension.

When we say closed for modification, it means new changes should be implemented by the new code, rather than altering existing code. This reduces the possibility of breaking existing tried and tested code.  

**2017_Q2**(d) Give a step-by-step re-design of the above code sample, such
		that the resulting code satisfies the above requirements. Clearly
		label any design-pattern you decide to implement and also
		clearly label and describe the components of the pattern you
		choose. 
		 
**2016_Q2**(a)

```java
// Beer.java 

package beers;
class Beer{
protected void taste(){
 //…code
}
}

// PaleAle.java

package beers.paleales;
//missing code
class PaleAle extends Beer{
 void taste(){
 //re-use Beer.taste()
 //add more hop taste
 }
}

```
 
**2016_Q2**(a)(i) Identify all compile errors in the code above. 

**2016_Q2**(a)(ii) For each compile error, briefly explain what causes the error.  

* Beer is not `public`
* Missing `import beers.Beer;` in PaleAle
* void taste() in PaleAle should be `private` or `public` - cannot assign weaker privileges 

**2016_Q2**(b) Assuming all compile errors were fixed and the taste()
		method in each class was protected – state if the following
		class would compile, explain why or why not in your answer:  

```java

package beers.paleales;
class Runner{
 public static void main(String[] args){
 Beer b = new PaleAle();
 b.taste();
 }
}

```

No:
* missing `import beers.Beer;`
* `taste()` has protected access in Beer

**2016_Q2**(c) Write a complete code example to demonstrate the Strategy
		design pattern. Briefly explain all the components of this design
		pattern and identify them in your code example.   

**2016_Q2**(d)
```java

//Given the code:
/*1.*/ class Item{
/*2.*/ private int price;
/*3.*/ int priceWithTax = price * 1.2;
/*4.*/ public int getPriceIncludingTax(){
/*5.*/ return priceWithTax;
/*6.*/ }
/*7.*/ }

```

		Is this class well encapsulated? Can the priceWithTax be
		guaranteed to be always 20% greater than the price? Suggest
		any changes you would make to improve the code.   

Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.  

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.  

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the variables values.  

`double priceWithTax = price * 1.2;` is BAD! Because no setter, `getPriceIncludingTax()` will always return `0.0` as answer.  

`int priceWithTax = price * 1.2;` - incompatible types: possible lossy conversionfrom double to int. This code will not compile.

* change `int` to `double

No, you cannot guarantee priceWithTax will always be 20% greater than the current price - it will always have the value `0.0`.  

```java
class Item{
  private double price;
  // will always return 0.0 as answer - BAD!
  // DONT NEED THIS VARIABLE AT ALL
  // double priceWithTax = price * 1.2;

  public double getPriceIncludingTax(){
    return price * 1.2;
  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double x){
    price = x;
  }
}
```

## Question 3 (and Q4 **2017**)

**2018_Q3**(a) What is the purpose of the virtual keyword used on line 4
		of the code above? Write example code that demonstrates the
		effect of the virtual keyword above (what it achieves). Briefly
		explain your answer.  

**2016_Q3**(a) What is the purpose of the virtual keyword used on line 5
		of the code above? Write example code that demonstrates the
		effect of the virtual keyword above (what it achieves). Briefly
		explain your answer.  

**2018_Q3**(b) A C++ destructor must often be declared virtual. Give a C++
		code sample that declares a virtual destructor for class A
		above and explain why it might need to be declared virtual.  

**2016_Q3**(b) A C++ destructor must often be declared virtual. Give a C++
		code sample that declares a virtual destructor for class A
		above and explain why it might need to be declared virtual.   

**2017_Q3**(b) In C++ - what is a destructor? Give a code example. Also, give
		another example to explain why a destructor might need to be
		declared virtual.  

**2018_Q3**(c) Write a definition for the function start() of class XCar
		(above) such that it re-uses the code in the start()function of
		class Car (i.e. its base-class).  

```c++
// **2018** Q3
// Given the code:
/*1.*/ 	class Car {
/*2.*/ 		public:
/*3.*/ 			Car();
/*4.*/ 			virtual void start();
/*5.*/ 	};
/*6.*/ 	class XCar : public Car {
/*7.*/ 		public:
/*8.*/ 			XCar();
/*9.*/ 			void start();
/*10.*/ };
```

**2016_Q3**(c) Write a definition for the function doX() of class B (above)
		such that it re-uses the code in the doX()function of class A
		(i.e. its base-class).   
```c++
// **2016** Q3
// Given the code:
/*1.*/ 	class A {
/*2.*/ 		public:
/*3.*/ 			A();
/*4.*/ 			virtual void doX();
/*5.*/ 	};
/*6.*/ 	class B : public A {
/*7.*/ 		public:
/*8.*/ 			B();
/*9.*/ 			void doX();
/*10.*/ };
```

**2018_Q3**(d) In C++ there is no super keyword such as there is in Java.
		Briefly explain why this is the case – give an example of a C++
		situation where the concept of super would be ambiguous.  

**2016_Q3**(d) In C++ there is no super keyword such as there is in Java.
		Briefly explain why this is the case – give an example of a C++
		situation where the concept of super would be ambiguous.   

**2018_Q3**(e) What is the “deadly diamond of death”? Briefly explain using
		example C++ code. Also, state and explain if the problem exists
		in the Java programming language (as of Java 8).   

**2017_Q4**(c) What is the “deadly diamond of death”? Briefly explain using
		example C++ code and explain.   

**2016_Q3**(e) Give a complete C++ code sample of a Factory Method design
		pattern. In the code-sample ensure you highlight a pure virtual
		function and explain what it does.   

**2017_Q3**(a) Compare C++ and Java with respect to early (static) and late
		(dynamic) binding of function/method calls. For each language,
		clearly state if the language provides that type of binding. Also,
		give a code example to show the difference between languages
		when needed.  

**2017_Q3**(c) Compare C++ and Java with respect to how the object lifetime
		is managed in each language.  

**2017_Q3**(d) Compare C++ and Java with respect to how a deep copy of an
		object can be achieved. Briefly explain the difference between a
		deep and shallow copy of an object in your answer.  
	
## Question 4

**2018_Q4**(a) Give a brief overview (including code-samples) of any two of the
		Java Collection classes and briefly compare them to their
		equivalents in C++ (including code-samples).  

**2016_Q4**(a) Give a brief overview (including code-samples) of any two of the
		Java Collection classes and briefly compare them to their
		equivalents in C++ (including code-samples).  

**2018_Q4**(b) Write one Java generic class definition and one C++ template
		class definition and briefly compare and contrast both language
		mechanisms.   

**2016_Q4**(b) Write one Java generic class definition and one C++ template
		class definition and briefly compare and contrast both language
		mechanisms.  

**2018_Q4**(c) Write a C++ copy constructor, and give a short C++ code
		sample to show a copy assignment operator being used.  

**2016_Q4**(c) Write a C++ copy constructor, and give a short C++ code
		sample to show a copy assignment operator being used.   

**2018_Q4**(d) Give an example that explains how the use of the clone()method
		in Java can result in a shallow copy of an object. Compare the
		Java and C++ languages in this respect.   

**2016_Q4**(d) Give an example that explains how the use of the
		clone()method in Java can result in a shallow copy of an
		object. Compare the Java and C++ languages in this respect.   

**2017_Q4**(a) Hash tables and Sets are two commonly used data-structures.
		Both the Java and C++ collection classes provide library
		implementations for these data-structures. Choose any two
		operations for each data-structure and compare how you write
		the code in each language. (E.g. operation1 {Java versus C++},
		operation2 {Java versus C++}).   

**2017_Q4**(b) Using either C++ or Java code-examples, briefly summarize the 
		features of the Exception mechanism in the language, briefly
		explain the advantages of using exceptions, and show how the
		Exception mechanism rules are effected when declaring subclasses 
		(i.e. when polymorphism takes effect).  



	





