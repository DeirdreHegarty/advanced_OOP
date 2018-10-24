class TheRealSlimShady
{
	// private _real, so that it can be 
	// accessed by only by own methods 
	private static TheRealSlimShady _real;	//static ref of same type as self 		
	static int numObjects;
	
	// can't be called from outside the class
	private TheRealSlimShady()
	{
		System.out.println("TheRealSlimShady()");
		numObjects++;
	}

	// SYNCHRONIZED method to control simultaneous access (OPTION 1 & OPTION 2)
	// CON : slow performance (Double check locking mechanism to better this issue)

	// OPTION 1 
	// standUp1() method is synchronized so it causes slow performance as 
	// multiple threads can’t access it simultaneously.
	synchronized public static TheRealSlimShady standUp1()   
	{
		System.out.println("SYNCHRONIZED METHOD");
		if(_real == null)
		{
			_real = new TheRealSlimShady(); 
		}	
		return _real; //return instance that already has been set
	}

	// OPTION 2
	// standUp2() is not synchronized but the block which creates instance IS 
	// synchronized so that minimum number of threads have to wait and that’s 
	// only for first time.

	public static TheRealSlimShady standUp2() 
	{ 
		System.out.println("LAZY INITIALIZATION WITH DOUBLE CHECK LOCKING");
	    if (_real == null)  
	    { 
	      //synchronized block to remove overhead 
	      synchronized (TheRealSlimShady.class) 
	      { 
	        if(_real==null) 
	        { 
	          // if instance is null, initialize 
	          _real = new TheRealSlimShady(); 
	        } 
	        
	      } 
	    } 
	    return _real; 
	  }

	// OPTION 3 = Bill Pugh Singleton Implementation (no synchronization)
	// concept of inner static classes to use for singleton

	// When the singleton class is loaded, inner class is not loaded 
	// and hence doesn’t create object when loading the class. 
  	// Inner class is created only when standUp3() method is called. 
	// So it may seem like eager initialization but it is lazy initialization.

	// Inner class to provide instance of class 
	private static class Slim
	{
		private static final TheRealSlimShady INSTANCE = new TheRealSlimShady(); 
	}

	public static TheRealSlimShady standUp3()
	{
		System.out.println("INNER STATIC CLASSES");
	 	return Slim.INSTANCE;
	}

}