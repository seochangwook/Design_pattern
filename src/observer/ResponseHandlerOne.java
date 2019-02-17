package observer;

/*
 * Observer : 등록된 옵저버로 Observable로부터 데이터를 받는다.
 */

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
