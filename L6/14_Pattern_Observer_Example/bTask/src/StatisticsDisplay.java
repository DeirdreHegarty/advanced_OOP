
public class StatisticsDisplay{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	
	public StatisticsDisplay() {
		
	}

	public void update(float aTemperature, float aHumidity, float aPressure) {
		tempSum += aTemperature;
		numReadings++;

		if (aTemperature > maxTemp) {
			maxTemp = aTemperature;
		}
 
		if (aTemperature < minTemp) {
			minTemp = aTemperature;
		}
		//'aHumidity' argument, & 'aPressure' argument not needed for StatisticsDisplay
		display();
	}

	public void display() {
		System.out.println("\tAvg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp+"\n");
	}
}
