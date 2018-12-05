package drinks;
import fruits.Apple; //01 imported

class Cider{ // doesn't need to be public (same package as main)
	Apple appleType; // needs to be public

	Cider(){ // doesn't need to be public (package access)
		appleType = new Apple("coxes"); // needs to be made public
	}
  
	
}

