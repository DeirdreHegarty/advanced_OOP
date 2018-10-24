class Runner
{
	public static void main(String[] args)
	{
		PokerDealer at111 = PokerDealer.someMethod();
		System.out.println(at111+", obj' "+PokerDealer.numObjects);
		
		PokerDealer at222 = PokerDealer.someMethod();
		System.out.println(at222+", obj' "+PokerDealer.numObjects);
		
		//PokerDealer dealer = new PokerDealer(); //won't compile 	
		
	}
}
