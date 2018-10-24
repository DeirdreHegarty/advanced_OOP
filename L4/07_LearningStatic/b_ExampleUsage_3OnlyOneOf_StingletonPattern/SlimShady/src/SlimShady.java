class SlimShady
{
	static SlimShady _real;	//static ref of same type as self 		
	static int numObjects;
	
	// can't be called from outside the class
	private SlimShady()
	{
		System.out.println("SlimShady()");
		numObjects++;
	}

	// important that this is static 
	public static SlimShady standUp()   
	{
		System.out.println("standUp()");
		if(_real == null)
		{
			_real = new SlimShady(); 
		}	
		return _real; //return instance that already has been set
	}
}