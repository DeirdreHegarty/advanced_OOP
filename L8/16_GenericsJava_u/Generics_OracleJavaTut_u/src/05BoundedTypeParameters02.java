/**
 * @see http://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 *	Bounded Type example. Below, the NumContainer class is bounded, to 
 *		accept Types that are either Num or a SubType (but no other).
 *		...--|>Num therefore is the "bounds" (/limit) to types accepted.
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
 
 class NumContainer<T extends Num> {
    private T n;								//'n' declared within subclass bounds of Num

    public NumContainer(T n)  { this.n = n; }

    public boolean isEven() {
		return n.value() % 2 == 0;			//'n' is guaranteed to have Num.intValue()
    }
    // ...
}
class Test{
    public static void main(String[] args) {
			NumContainer<SmallNum> numInside = new NumContainer<>( new SmallNum(2) );
			System.out.println("numInside is even?: "+numInside.isEven() );
    }
}