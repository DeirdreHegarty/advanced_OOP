public class ForecastDisplay{
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay() {
	}

	public void update(float aTemperature, float aHumidity, float aPressure) {
		currentPressure = aPressure;
		lastPressure = currentPressure;

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
