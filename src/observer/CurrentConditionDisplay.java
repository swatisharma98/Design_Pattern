package observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Condition:"+temperature+"  Humidity=="+humidity+"  pressure=="+pressure);
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
