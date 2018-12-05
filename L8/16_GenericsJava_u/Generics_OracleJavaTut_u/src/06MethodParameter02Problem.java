/**
 * @see https://docs.oracle.com/javase/tutorial/java/generics/inheritance.html
 */
class Num{								
	int a;
	Num(int aVal){ a = aVal; }
	int value(){ return a; }			
}
class SmallNum extends Num{				
	SmallNum(int aVal){
		super(aVal);
		this.a = (aVal < 100) ? aVal : 0;	//only allows values < 100
	}
}
class Box<T extends Num> {
    private T t;          
    public void set(T t) {  this.t = t;  }
    public T get() { return t;    }
}
class Test{
    public static void main(String[] args) {
        Box<SmallNum> numBox = new Box<SmallNum>();	
        numBox.set( new SmallNum(10) ); 			// fine! as Box<SmallNum>
		Test.boxTest( numBox );						// TASK: Problem: why?		
    }
	static void boxTest(Box<Num> boxWithNum){
		System.out.println("inside boxTest()"); 
	}
}