// Factory Method Pattern
abstract class MutantIngredientFactory{
	abstract public Mutate createMutation();
}

class IsMutantIngredient extends MutantIngredientFactory{

	public Mutate createMutation(){
		return new IsMutant();
	}

}
class IndividualStore extends MutantStore{
	protected Chromosome getChromeSubclass(String aName) {
		System.out.println("Inside abstract IndividualStore");
		Chromosome c = null;
		mfactory = new IsMutantIngredient();
		c = new Individual(aName,mfactory);
		return c;
	}
}
abstract class MutantStore{
	MutantIngredientFactory mfactory;

 	Chromosome createChrome(String aName){
 		Chromosome chrome = getChromeSubclass(aName);
		System.out.println("Inside abstract MutantStore");
		return chrome;//abs below 
	}
	
	// factory method
	abstract Chromosome getChromeSubclass(String aName);// <---- factory method 
 }

// abstract class CoupleFactory{

// 	Couple getCouple(Chromosome c1, Chromosome c2){
// 		System.out.println("Inside abstract CoupleFactory");
// 		return getCoupleSubclass(c1, c2);//abs below 
// 	}
// 	// factory method
// 	abstract Couple getCoupleSubclass(Chromosome c1, Chromosome c2);// <---- factory method 
// }
// class CoupleGetter extends CoupleFactory{
// 	Couple getCoupleSubclass(Chromosome c1, Chromosome c2){ 		// <---- factory method 
// 		System.out.println("Inside CoupleGetter");
// 		return new Couple(c1, c2);
// 	}
// }
