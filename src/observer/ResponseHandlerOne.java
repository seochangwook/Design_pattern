package observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandlerOne implements Observer{
	private Test test;

	@Override
	public void update(Observable object, Object arg) {
		if(object instanceof EventSource) {
			this.test = (Test)arg; //파라미터로 전달받은 값 설정//
			
			System.out.println("\nHandler One Call");
			
			System.out.println("Observable Object: " + object);
			System.out.println("Update Name Field: " + this.test.getName());
		}
	}
}
