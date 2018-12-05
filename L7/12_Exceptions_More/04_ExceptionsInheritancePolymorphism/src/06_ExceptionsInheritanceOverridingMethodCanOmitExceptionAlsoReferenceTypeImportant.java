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
	void doIOOperation() {	//no "throws" in override (i.e. no "exception specification")
		if(Math.random() > .01){ //simulate more specific File not found Exception
			try{
				throw new java.io.FileNotFoundException();
			}catch(java.io.FileNotFoundException fnf){
				; //do nothing {NOTE: BAD practice only for an example]
			}
		}
	}
}
class Tester{
	public static void main(String[] args){
		IOThing  	 a = new IOThing();
		//FileIOThing  b = new FileIOThing();
		//IOThing      c = new FileIOThing();
		
		a.doIOOperation(); //require try{}catch() ?
		//b.doIOOperation(); //require try{}catch() ?
		//c.doIOOperation(); //require try{}catch() ?
	}

}
//void doIOOperation()	//see SCJP page 108: remove exception specification and see what happens