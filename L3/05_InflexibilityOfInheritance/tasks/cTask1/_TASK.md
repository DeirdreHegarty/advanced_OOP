TASKQuestion:
What is wrong with the approach to override methods to 
do nothing?  


Marks will be awarded for:  
a) Briefly explaining a negative consequence of this approach.  

* client programmer expectation not fulfilled (if fly() is present in the inteface of the duck it is expected that fly is returned)
* there will be code that wont run the way that is expected to run (if method is accessible)

b) Having used the terms 'client programmer' and 'interface'
	appropriately in the explanation.  

**client programmer:**   
Programmer that writes code (could be in the main method), accessing other classes, methods etc..

**interface:**
An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

Acts like an abstract class, but children need to use keyword `implements` instead of `extends`. Its implementation needs to be public, and can contain any number of methods. An interface contains behaviors that a class implements.

e.g. redheadduck type reference = interface to redheadduck has access to class duck contents
