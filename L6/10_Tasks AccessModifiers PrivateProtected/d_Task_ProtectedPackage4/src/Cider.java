package drinks;
import fruits.Fruit;
import fruits.apples.Apple;
class Cider{
 
  Fruit appleType;
  
  Cider(){
	appleType = new Apple("coxes");
	appleType.taste(); //does this work?
  }
    
}
