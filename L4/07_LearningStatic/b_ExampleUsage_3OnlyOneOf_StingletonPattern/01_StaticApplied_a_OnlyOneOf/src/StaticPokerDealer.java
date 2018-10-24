/**
 * Suppose that in a poker card game, you cannot have two-or-more
 * players with a reference to a different dealer.
 */
class PokerPlayer
{
	PokerDealer dealer;			
	
	void setDealer(PokerDealer aDealer){
		dealer = aDealer;
	}

}
class PokerDealer{//...
}

class Runner{
	public static void main(String[] args){
		PokerPlayer p1 = new PokerPlayer();
		PokerPlayer p2 = new PokerPlayer();
		p1.setDealer( new PokerDealer());
		p2.setDealer( new PokerDealer());	//*HERE p2 will have a different dealer Object
	
		System.out.println("p2's dealer: "+p1.dealer ); // objectID
		System.out.println("p2's dealer: "+p2.dealer ); // different ObjectID
	}
}

/*
 *	As a quick experiment above: 
 *	1. Compile & Execute the code as it is, and observe the output
 *	2. change the declaration of the PokerDealer to make it static: i.e.
 *			static PokerDealer dealer;
 *	3. Compile & Execute the code then. Observe & explain the output
 */