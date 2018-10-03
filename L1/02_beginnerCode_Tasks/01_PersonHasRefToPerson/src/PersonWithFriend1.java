/**
*	TASK Part 1:
*	OK, here, the class person is declared with an attribute
*	called 'friend'. The type of this 'friend' attribute however is 
*	'Person': which is the class we are declaring. 
*	(?) This can be confusing if you're new to it (?)
*/
class Person{				
	String name;					
	Person friend;					//'Person friend;' declaration
	
	Person(String aName){	
		name = aName;
	}
		
	public String toString(){
		return name;
	}
}	
