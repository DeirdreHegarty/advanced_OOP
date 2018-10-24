class Runner
{
	public static void main(String[] args)
	{	
		System.out.println("********************************************");
		System.out.println("SlimShady() - Not Thread Safe");
		System.out.println("********************************************");

		System.out.println("COULD SLIM SHADY PLEASE STAND UP?");
		SlimShady slim1 = SlimShady.standUp();
		System.out.println("\tSlimShady.numObjects = "+SlimShady.numObjects+", \n\tslim1: "+slim1);
		
		System.out.println("COULD SLIM SHADY PLEASE STAND UP?");
		SlimShady slim2 = SlimShady.standUp();
		System.out.println("\tSlimShady.numObjects = "+SlimShady.numObjects+", \n\tslim2: "+slim2);
		
		System.out.println("********************************************");
		System.out.println("TheRealSlimShady() - Thread Safe");
		System.out.println("********************************************");


		TheRealSlimShady real_slim1 = TheRealSlimShady.standUp1();
		System.out.println("\tTheRealSlimShady.numObjects = "+TheRealSlimShady.numObjects+", \n\treal_slim1: "+real_slim1);


		TheRealSlimShady real_slim2 = TheRealSlimShady.standUp2();
		System.out.println("\tTheRealSlimShady.numObjects = "+TheRealSlimShady.numObjects+", \n\treal_slim2: "+real_slim2);
		

		TheRealSlimShady real_slim3 = TheRealSlimShady.standUp3();
		System.out.println("\tTheRealSlimShady.numObjects = "+TheRealSlimShady.numObjects+", \n\treal_slim3: "+real_slim3);
		

	}
}