class TicketSalesAgent
{
	static int totalSaleCount;		//A 'static' to count all sales
	int thisAgentSaleCount;			//An 'instance' to count this Agent's sales
	
	String agentName;
	
	TicketSalesAgent(String aName){
		agentName = aName;
	}
	
	void sellTicket(){
		System.out.println(agentName+" just sold 1 ticket");
		totalSaleCount++;			//add to total sale count
		thisAgentSaleCount++;		//add to this agent sale count
	}
}
class Runner{
	public static void main(String[] args){
		TicketSalesAgent pinky = new TicketSalesAgent("Pinky");
		TicketSalesAgent brain = new TicketSalesAgent("Brain");
		
		pinky.sellTicket();
		brain.sellTicket();
		brain.sellTicket();
		
		System.out.println( "tickets sold: "+TicketSalesAgent.totalSaleCount ); 
	}
}