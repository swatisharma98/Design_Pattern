package observer;

public class StatisticDisplay implements Observer,DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	public StatisticDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("StatisticDisplay Condition:"+temperature+"  Humidity=="+humidity+"  pressure=="+pressure);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
