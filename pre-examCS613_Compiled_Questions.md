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

**2016_Q1**(a) If a subclass defines the same method as a superclass (i.e. with
		exactly the same method signature) – what is this typically
		referred to as?  

**2016_Q1**(b) Define a subclass called ClassicViolin that has a method
		called play(). Write that method to re-use the code in the
		Violin superclass and then add its own specialized code.   
 
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

**2016_Q1**(c)(ii) Write example-code showing how instanceof could be
		used to call the tune() method in this case. Explain the
		code.  

**2016_Q1**(c)(iii)What is the Liskov Substitution Principle? State whether
		using instanceof supports or violates this principle.  


**2016_Q1**(d) Suppose there was a requirement that tune()should work the
		same for all subclasses but each subclass should implement
		display()differently.  

**2016_Q1**(d)(i) Write example code showing how this could be achieved
		with maximum code re-use.  

**2016_Q1**(d)(ii) Write a polymorphic method that could accept any
		subclass of Violin and call tune() and display().  

**2016_Q1**(d)(iii) What would be the effect of defining tune()to be final
		in this case?  


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


**2017_Q1**(b)Could the above abstract class definition for Person be used to
		implement a composition relationship between the classes
		Person and Brain? Explain using code samples.  


**2017_Q1**(c) Give an example of a factory method design pattern (any
		example of your choosing) and ...   

**2017_Q1**(c)(i)   clearly identify the factory method in your example.   

**2017_Q1**(c)(ii)  provide a full sample-code.   

**2017_Q1**(c)(iii) explain the role of polymorphism in the pattern.   

**2017_Q1**(c)(iv)  state and explain whether an abstract class or interface
				(or either) is needed to implement the pattern. 

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

**2018_Q1**(a)(i) 
		Identify a member of the class Fiddle, and briefly
		explain how you know this member exists.    

**2018_Q1**(a)(ii) 
		State the access modifier that the member must have,
		and say how you know this to be the case.    

**2018_Q1**(b)
		Could the following class declaration be valid for Fiddle?  
		```java
		 class Fiddle{ …
		 ```
		(You can assume it would be within a file called Fiddle.java).    

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
**2018_Q1**(c)(ii) If you were not allowed to add code to the class
		Runner, but could change ClassicFiddle - state
		how you could get this to compile, and explain how it
		would work.  

**2018_Q1**(c)(iii) If you could only change the code in the class Runner –
		state how you could get this to compile and explain how it
		would work.  

**2018_Q1**(c)(iv) Given that the following package structure is required:  

		* exec.Runner
		* instruments.Fiddle: 
		* instruments.classic.ClassicFiddle

		Write a full code example such that the code would
		compile and execute without error. (Note: You can use
		empty method bodies but include all necessary accessmodifiers; 
		no explanation is required.)    

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

		(ii) Outline five characteristics you would expect to see in
		code for a singleton-pattern implementation (i.e. about the
		constructor, a method you’d expect to see… etc.).  

		(iii) State and briefly explain why a programmer might need to
		be careful when implementing a singleton in a multithreaded 
		environment.  


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

**2017_Q2**(b) With respect to Object Oriented programming - what is meant by
		the terms “call-back”, “push” and “pull”. Give brief code
		examples and explain.  

**2017_Q2**(c) Briefly explain what is meant by the “open/closed” principle.
		Explain the principle with respect to your answer to the pattern
		you identified in part (a) of this question if possible.
		(Alternatively – refer to any design pattern which you feel
		adheres to the principle).  

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



	





