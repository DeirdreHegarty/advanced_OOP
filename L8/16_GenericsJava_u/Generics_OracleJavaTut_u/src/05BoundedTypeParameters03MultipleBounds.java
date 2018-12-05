/**
 * @see http://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 *		...multiple bounds are defined	for NumContainer
 */
interface Containable{}					//Interface declared
class Num{								//Type Num
	int a;
	Num(int aVal){ a = aVal; }
	int value(){ return a; }			
}
class SmallNum extends Num{				//Type SmallNum extends Num (but not Containable)
	SmallNum(int aVal){
		super(aVal);
		this.a = (aVal < 100) ? aVal : 0;	
	}
}

class OtherNum extends Num implements Containable{	//Type OtherNum exends Num implements Containable
	OtherNum(int aVal){
		super(aVal);
	}
}		//Satisfies the new multiple bounds
 
					//Note: no comma, just '&' symbols	
 class NumContainer<T extends Num & Containable > { //**HERE! Multiple Bounds
    private T n;								

    public NumContainer(T n)  { this.n = n; }

    public boolean isEven() {
		return n.value() % 2 == 0;			
    }
}
class Test{
    public static void main(String[] args) {
			//Now this no longer works! (Not Containable)
			//NumContainer<SmallNum> numInside = new NumContainer<>( new SmallNum(2) );
			//System.out.println("is numInside even?: "+numInside.isEven() );
			//Now, this works!
			NumContainer<OtherNum> multiBound = new NumContainer<>( new OtherNum(4) );
			System.out.println("is multiBound even?: "+multiBound.isEven() );

    }
}