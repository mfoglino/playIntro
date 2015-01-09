package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import services.observer.WeatherPublisher;
import services.observer.User;

public class WeatherController extends Controller {
	
	static User station = new User();
	static WeatherPublisher central = new WeatherPublisher();
	
	
	
	public static Result giveMeWeather()
	{
		
		
		
		return ok();
		
	}

}
