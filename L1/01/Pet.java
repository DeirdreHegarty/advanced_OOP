abstract class Pet{
	String name;
	String sound;
	String gender;

	Pet(String name, String sound, String gender){
		this.name = name;
		this.sound = sound;
		this.gender = gender;
	}
	public String toString(){
		return "{ \nPet: " + name + ", sound: " + sound + ", gender: " + gender;
	}

}