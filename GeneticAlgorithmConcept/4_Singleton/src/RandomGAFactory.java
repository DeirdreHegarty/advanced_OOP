class RandomGAFactory implements GA{

	//singleton
	private static RandomGAFactory _real;
	private RandomGAFactory(){
		// System.out.println("SINGLETON CONSTRUCTOR");
	}
	public static RandomGAFactory createRGF() 
	{ 
		// System.out.println("LAZY INITIALIZATION WITH DOUBLE CHECK LOCKING");
	    if (_real == null)  
	    { 
	      //synchronized block to remove overhead 
	      synchronized (RandomGAFactory.class) 
	      { 
	        if(_real==null) 
	        { 
	          // if _real is null, initialize 
	          _real = new RandomGAFactory(); 
	        } 
	        
	      } 
	    } 
	    return _real; 
	  }


	public Mutate createMutatorGA(String input){
		if(input.equals("Is Mutant"))
			return new IsMutant();
		else if(input.equals("Not Mutant"))
			return new NotMutant();
		return null;
	}
	public Selection createSelectGA(String input){
		return new TheRandom();
	}
}