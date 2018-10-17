TASKQuestion:  
What is wrong with the approach to introduce  classifiers 
(i.e. 'FlyingDuck', NonFlyingDuck' etc.) into the type
hierarchy of the ducks problem?  

Marks will be awarded for:  
a) Briefly explaining a negative consequence of this approach.  

* it introduces another set of considerations for when the code needs to be updated etc. (many things will need to be changed in multiple places for consistency - repeated code)
* a subclass cannot extend multiple abstract classes
* there will be a lot of extending super classes, and super classes of super classes
* If there are n attributes in the type system, there are 2n possible combinations that you might have to support (**class explosion/combinatorial explosion**)
* could have abjects that satisfy only parts of their parent class


b) Having used the terms 'repeating code', 'class explosion' and 
	referring to the "DRY" synonym appropriately in the explanation.    

**DRY:**   
"Don't repeat yourself!" == "Don't write the same code repeatedly". If there is a lot of repeated code/copying and pasting of code then it doesn't adhere to the DRY principle.    

**class explosion:**     
If there are n attributes in the type system, there are 2n possible combinations that you might have to support. For example, not all ducks can quack, fly and swim. There will be different combinations of these behaviours, and it this problem will become more complex as variables are introduced.  
