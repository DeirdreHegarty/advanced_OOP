// Factory Method Pattern
class IndividualGetter extends ChromeFactory{
	Chromosome getChromeSubclass(String inputString){ 		// <---- factory method 
		System.out.println("Inside IndividualGetter");
		return new Individual(inputString);
	}
}