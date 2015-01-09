package services.observer;

import lombok.Data;

@Data
public class User implements WeatherObserver {

	@Override
	public void update(String news) {
		System.out.println(news);		
	}
}
