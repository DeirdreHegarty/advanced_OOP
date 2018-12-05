package fruits.apples;
//import fruits.Fruit;
public class Apple extends fruits.Fruit{
	String type;
	
	public Apple(String aType)
	{
		type = aType;
	}
	public void taste(){
		System.out.println("yum");
	}
}
