// Factory Method Pattern
abstract class ChromeFactory{

	Chromosome getChrome(String inputString){
		System.out.println("Inside abstract Chrome_Factory");
		return getChromeSubclass(inputString);//abs below 
	}
	
	// factory method
	abstract Chromosome getChromeSubclass(String inputString);// <---- factory method 

}
class IndividualGetter extends Chrome_Factory{
	Chromosome getChromeSubclass(String inputString){ 		// <---- factory method 
		System.out.println("Inside IndividualGetter");
		return new Individual(inputString);
	}
}

abstract class CoupleFactory{

	Couple getCouple(Chromosome c1, Chromosome c2){
		System.out.println("Inside abstract CoupleFactory");
		return getCoupleSubclass(c1, c2);//abs below 
	}
	// factory method
	abstract Couple getCoupleSubclass(Chromosome c1, Chromosome c2);// <---- factory method 
}
class CoupleGetter extends CoupleFactory{
	Couple getCoupleSubclass(Chromosome c1, Chromosome c2){ 		// <---- factory method 
		System.out.println("Inside CoupleGetter");
		return new Couple(c1, c2);
	}
}
