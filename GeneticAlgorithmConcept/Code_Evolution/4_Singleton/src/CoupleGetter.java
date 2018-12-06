// Factory Method Pattern
class CoupleGetter extends CoupleFactory{
	Couple getCoupleSubclass(Chromosome c1, Chromosome c2){ 		// <---- factory method 
		System.out.println("Inside CoupleGetter");
		return new Couple(c1, c2);
	}
}