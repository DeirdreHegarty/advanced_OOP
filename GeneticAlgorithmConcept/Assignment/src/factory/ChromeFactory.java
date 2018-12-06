package factory;

import strategy.Chromosome;

// Factory Method Pattern
public abstract class ChromeFactory{
	/**
	 * getChrome makes a call to the abstract method getChromeSubclass, contained inside ChromeFactory.
	 * @param inputString This corresponds to the name/encoding of the Chromosome object.
	 * @return call to getChromeSubclass
	 */
 	public Chromosome getChrome(String inputString){
		System.out.println("Inside abstract Chrome_Factory");
		return getChromeSubclass(inputString);//abs below 
	}
	
	// factory method
	abstract Chromosome getChromeSubclass(String inputString);// <---- factory method 
 }