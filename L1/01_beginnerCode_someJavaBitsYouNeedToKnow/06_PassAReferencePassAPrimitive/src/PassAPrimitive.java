/*
*This work by Rob Cleary is licensed under a Creative Commons AttributionShareAlike
*3.0 Unported License. Based on a work at www.usethetools.net. Permissions beyond
*the scope of this license may be available via usethetoolsinstructor1@gmail.com.
*/
class PassAPrimitive{

   public static void main(String[] args)
   {  
	  Person p1 = new Person(“tim”, 14);
	  System.out.println("tim is: "+p1.age); 
	   
	  makeOneYearOlder(p1.age);//pass an int
	   
	  System.out.println("tim is: "+p1.age);
   }

   static void makeOneYearOlder(int intPassedIn)
   {
       intPassedIn += 1;  
   }
} 