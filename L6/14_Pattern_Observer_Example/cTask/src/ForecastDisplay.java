public class ForecastDisplay implements Observer{
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject aWeatherData) {
		this.weatherData = aWeatherData;
		weatherData.registerObserver(this);
	}

	public void update(float aTemperature, float aHumidity, float aPressure) {
		lastPressure = currentPressure;
		currentPressure = aPressure;

		display();
	}

	public void display() {
		System.out.print("\tForecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("\tImproving weather on the way!\n");
		} else if (currentPressure == lastPressure) {
			System.out.println("\tMore of the same\n");
		} else if (currentPressure < lastPressure) {
			System.out.println("\tWatch out for cooler, rainy weather\n");
		}
	}
}
