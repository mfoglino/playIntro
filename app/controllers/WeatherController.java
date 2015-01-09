package controllers;

import patterns.observer.User;
import patterns.observer.WeatherPublisher;
import play.mvc.Controller;
import play.mvc.Result;

public class WeatherController extends Controller {
	
	static User station = new User();
	static WeatherPublisher central = new WeatherPublisher();
	
	
	
	public static Result giveMeWeather()
	{
		
		
		
		return ok();
		
	}

}
