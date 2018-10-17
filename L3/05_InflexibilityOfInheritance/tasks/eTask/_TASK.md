Write the code as suggested in the comments of this folder.

Is there any problem with the suggestion to 
avoid inheritance and use interfaces instead? 

---

Using interfaces means that the implementation needs to be public. All the methods in an interface are abstract and so must be implemented in the sub classes. Unless specified as abstract, this would not be the case with inherited methods. Also there is no code as such defined in an interface, method behaviours must be specified elsewhere. This is not the case with inheritance, as the object type behaviors are specified within the class (or at least default attributes/behaviors).

---

Imagine a month passes and the Simulation Duck Software is working fine.  
The customer asks for a change to the fly() method   
	- add a println("wheesh"); to show the flying sound-effect to Ducks.  
	
Try to do this - what does it involve?  

---

To do this classes that implement `Flyable` must edit `fly()` to include the new print statement. Editing the code becomes less and less efficient with every flying bird type (a lot of repetition).  

