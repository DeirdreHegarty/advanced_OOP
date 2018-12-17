// Generic And Parameterized Types
// http://www.angelikalanger.com/GenericsFAQ/FAQSections/ParameterizedTypes.html#What%20is%20a%20parameterized%20(or%20generic)%20type?
class Pair<X,Y>  {  
  private X first; 
  private Y second;
  public Pair(X a1, Y a2) { 
    first  = a1; 
    second = a2; 
  } 
  public X getFirst()  { return first; } 
  public Y getSecond() { return second; } 
  public void setFirst(X arg)  { first = arg; } 
  public void setSecond(Y arg) { second = arg; } 


}
class Runner{

	public static void main(String [] args){

		// concrete parameterized type <String,Long>
		Pair<String,Long> limit1 = new Pair<String,Long> ("maximum",1024L); 
		printPair(limit1); //prints (maximum,1024)

		// wildcard parameterized type <?,?>
		Pair<?,?> limit2 = new Pair<String,Long> ("maximum",1024L); 
		printPairWildCard(limit2);
	}
	public static void printPair( Pair<String,Long> pair) { 
	 	System.out.println("("+pair.getFirst()+","+pair.getSecond()+")"); 
	}
	public static void printPairWildCard( Pair<?,?> pair) { 
	 	System.out.println("("+pair.getFirst()+","+pair.getSecond()+")"); 
	}
	
}
