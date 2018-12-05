/*
 *Note: Exception<--IOException<--FileNotFoundException
 */
class IOThing{
	void doIOOperation() throws java.io.IOException{
			
		if(Math.random() > .01){	//simulate a general IO exception
			throw new java.io.IOException();
		}
	}
}
class FileIOThing extends IOThing{
	@Override							
	void doIOOperation() throws java.io.FileNotFoundException{
		if(Math.random() > .01){ //simulate more specific File not found Exception
			throw new java.io.FileNotFoundException();
		}
	}
}
class Tester{
	public static void main(String[] args){
		IOThing  	 a = new IOThing();
		//FileIOThing  b = new FileIOThing();
		//IOThing      c = new FileIOThing();
		try{ 
			a.doIOOperation();
			//b.doIOOperation();  
			//c.doIOOperation();
		}catch(java.io.IOException ioe){ 
			ioe.printStackTrace();
		}

	}
	
		
}
//void doIOOperation()	//see SCJP page 108: remove exception specification and see what happens