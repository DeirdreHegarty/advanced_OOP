class Runner{
	public static void main(String args []){

		System.out.println("Two Pets:");
		Pet dog = new Dog("Lassie","Female");
		System.out.println(dog);
		Pet cat = new Cat("Cait","Female");
		System.out.println(cat);

		System.out.println("Two People");
		Person p1 = new Person("Sally");
		Person p2 = new Person("Wally");
		p1.setPet( cat );
		p2.setPet( dog );
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}