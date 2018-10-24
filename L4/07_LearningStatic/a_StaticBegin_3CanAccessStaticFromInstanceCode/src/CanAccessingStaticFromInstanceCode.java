/**
 * Example to show that static members CAN be accessed 
 * from an instance context (/block-of-code)
 */
class Ticket{
	static int ticketsSold;  			//A static or "class" variable
	
	Ticket(){							//An instance context/block
		ticketsSold += 1;				//	compiles ok!
	}

	int getTicketsSold(){				//An instance context/block
		return ticketsSold; 			//  compiles ok!
	}
	
}

class Runner{
	public static void main(String[] args){
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		
		System.out.println( "tickets sold: "+t2.ticketsSold() );
	}
}

