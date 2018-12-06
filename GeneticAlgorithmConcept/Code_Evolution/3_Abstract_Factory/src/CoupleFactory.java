// Factory Method Pattern
 abstract class CoupleFactory{
 	Couple getCouple(Chromosome c1, Chromosome c2){
		System.out.println("Inside abstract CoupleFactory");
		return getCoupleSubclass(c1, c2);//abs below 
	}
	// factory method
	abstract Couple getCoupleSubclass(Chromosome c1, Chromosome c2);// <---- factory method 
}