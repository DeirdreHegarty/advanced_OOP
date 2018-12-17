class Num{
	int a;

	Num(int aVal){ 
		a = aVal; 
	}

	int value(){ 
		return a; 
	}

	public String toString(){
		return Integer.toString(a);
	}			
}

class SmallNum extends Num{			    

  SmallNum(int aVal){
		super(aVal);
	}
}
class invalidNum{}							//Not a subclass of Num

class Box<T extends Num> {
    private T t;					

    public void set(T t) { 
    	this.t = t; 
    }

    public T get() { 
    	return t; 
    }

}
class Runner{
    public static void main(String[] args) {
    	Box<Num> n = new Box<>();
	    n.set( new Num(4) );
		System.out.println(n.get());

        Box<Num> sn = new Box<>();
	    sn.set( new SmallNum(4) );
		System.out.println(sn.get());

		Runner.boxTest(n);	
		Runner.boxTest(sn);	

		// Box<invalidNum> test; // type argument invalidNum is not within bounds of type-variable T
    }
    static void boxTest(Box<Num> boxToTest){
		System.out.println("inside boxTest()"); 
	}
}