package observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandlerTwo implements Observer{
	private Test test;
	
	@Override
	public void update(Observable object, Object arg) {
		if(object instanceof EventSource) {
			this.test = (Test)arg;

			System.out.println("\nHandler Two Call");
			
			System.out.println("Observable Object: " + object);
			System.out.println("Update Name Field: " + this.test.getName());
		}
	}
}
