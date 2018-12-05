public class CurrentConditionsDisplay {
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay() {
		
	}
	
	public void update(float aTemperature, float aHumidity, float aPressure) {
		this.temperature = aTemperature;
		this.humidity = aHumidity;
		//'aPressure' argument not needed for this CurrentConditionsDisplay
		display();
	}
	
	public void display() {
		System.out.println("\tCurrent conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity\n");
	}
}
