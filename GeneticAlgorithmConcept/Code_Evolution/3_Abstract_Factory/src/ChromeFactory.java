// Factory Method Pattern
abstract class ChromeFactory{

 	Chromosome getChrome(String inputString){
		System.out.println("Inside abstract Chrome_Factory");
		return getChromeSubclass(inputString);//abs below 
	}
	
	// factory method
	abstract Chromosome getChromeSubclass(String inputString);// <---- factory method 
 }