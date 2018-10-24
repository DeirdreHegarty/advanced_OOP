class PokerDealer
{		
		private static PokerDealer _instance;
		private static int numObjects;
		Deck theDeckOfCards = new Deck();
		
		private PokerDealer()
		{
			System.out.println("PokerDealer()");
			numObjects++;
		}
		
		public static PokerDealer someMethod()
		{
			if(_instance == null)
			{	
				_instance = new PokerDealer();
			}
				
			return _instance;
		}
		
}
class Deck
{
	//code for deck
}
