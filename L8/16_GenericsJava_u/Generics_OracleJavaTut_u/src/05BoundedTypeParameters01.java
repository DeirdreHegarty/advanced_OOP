/**
 * @see http://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 */
 class Num{								//Type Num
	int a;
	Num(int aVal){ a = aVal; }
	int value(){ return a; }			// ...has method 'value():int'
}

class SmallNum extends Num{				//Type SmallNum extends Num
	SmallNum(int aVal){
		super(aVal);
		this.a = (aVal < 100) ? aVal : 0;	//only allows values < 100
	}
}
class OtherNum{}							//Not a subclass

class Box<T> {

    private T t;          

    public void set(T t) {  this.t = t;  }
    public T get() { return t;    }

    public <U extends Num> void inspect(U u){					//**HERE the type-specification will allow
        System.out.println("T: field: " + t.getClass().getName());		// 		only arguments of type Num or subclasses
        System.out.println("U: param: " + u.getClass().getName());		// 		It is "bounded" to be only of these types
    }
}
class Test{
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set( new Integer(10) );
        integerBox.inspect( new SmallNum(10) ); 					// fine! is subclass
		//integerBox.inspect( new OtherNum() );						// Try this: what happens?
    }
}