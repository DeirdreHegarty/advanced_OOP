package fruits.apples;	//a sub-package this time

import fruits.Fruit; 	// 06 import
public class Apple extends Fruit{
	String type;
	
	public Apple(String aType){		// 03 made public
		type = aType;
	}
	public void squeeze(){		// 05 made public (if not will get error assigning weaker access)	
		System.out.println("Apple.squeeze()");
		System.out.println(this.getClass().getName());
	}
}
