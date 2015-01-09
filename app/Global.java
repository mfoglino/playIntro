import play.Application;
import play.GlobalSettings;
import play.Logger;



public class Global extends GlobalSettings {
	@Override
	public void onStart(Application arg0) {
		super.onStart(arg0);
		Logger.info("Application has started");
		System.out.println("Application has started");
	}
	
	@Override
	public void onStop(Application arg0) {
		Logger.info("Application shutdown...");
		super.onStop(arg0);
	}
}
