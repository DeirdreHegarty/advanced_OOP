
class Runner
{
	public static void main(String[] args)
	{
		//PokerDealer dealer = new PokerDealer(); // WON'T COMPILE
		
		System.out.println("Call instance() first time");
		PokerDealer dealer1 = PokerDealer.instance();
		System.out.println("PokerDealer.numObjects = "+PokerDealer.numObjects+", dealer:"+dealer1);
		
		System.out.println("Call instance() second time");
		PokerDealer dealer2 = PokerDealer.instance();
		System.out.println("PokerDealer.numObjects = "+PokerDealer.numObjects+", dealer2:"+dealer2);
		
	}
}