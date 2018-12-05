package drinks;
import fruits.Fruit; 		// 01 import for appleType ref
import fruits.apples.Apple; // 02 import for new Apple()

class Cider{
 
  Fruit appleType; // in different package so needed to import
  
  Cider(){
	appleType = new Apple("coxes"); // need to make Apple constructor public
	appleType.squeeze(); // will only work if squeeze() in fruit interface is abstract
  }
    
}
