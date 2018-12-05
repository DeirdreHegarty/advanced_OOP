 public class WeatherData{
	CurrentConditionsDisplay currentConditionsDisplay;
	
	float temperature;
	float pressure;
	float humidity;
	
	public WeatherData() {
		currentConditionsDisplay = new CurrentConditionsDisplay();
		
	}
	
	public void setMeasurements(float aTemperature, float aHumidity, float aPressure) {
		printUserMsg();
		this.temperature = aTemperature;
		this.humidity = aHumidity;
		this.pressure = aPressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
			currentConditionsDisplay.update(temperature, humidity, pressure);	
			
	}
	
	private void printUserMsg(){
		System.out.println("Weather Readings have Changed... updating...");
		try{
			Thread.sleep(2000); //pause for 2 seconds
		
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
