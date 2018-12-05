package classic;
import plain.PlainFiddle;

class ClassicFiddle extends PlainFiddle{
	void playSweetly(){
		play(); //works! Accessing play() through inheritance
		System.out.println("playSweetly():\t & plays sweetly");
		
		//*TASK: 
		PlainFiddle p2p   = new PlainFiddle();
		PlainFiddle p2c   = new ClassicFiddle(); 
		ClassicFiddle c2c = new ClassicFiddle();
		//p2p.play(); 		//compile error: not through inheritance  	   
		//p2c.play(); 		//compile error: not through inheritance  	   
		c2c.play(); 		//works! why?  	   
	}
	
}


	