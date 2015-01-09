package services;

import org.junit.Test;

import patterns.observer.User;
import patterns.observer.WeatherPublisher;

public class WeatherPublisherTest {
	
	
	@Test
	public void aTest()
	{
		User station1 = new User();
		User station2 = new User();
		WeatherPublisher central = new WeatherPublisher();		
		
		central.registerObserver(station1);
		central.registerObserver(station2);
		
		
		central.notifyObservers();
		
		//System.out.println("hola");
	}

}
