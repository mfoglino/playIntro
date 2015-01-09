package services.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher {

	List<WeatherObserver> observers = new ArrayList<WeatherObserver>();
	
	public void registerObserver(WeatherObserver observer)
	{
		observers.add(observer);
	}
	
	public void unregisterObserver(WeatherObserver observer)
	{
		observers.remove(observer);
	}
	
	public void notifyObservers()
	{
		for (WeatherObserver weatherObserver : observers) {
			String news = "Precipitation:0.88";
			weatherObserver.update(news); 
		}
	}
}
