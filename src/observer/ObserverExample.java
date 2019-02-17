package observer;

public class ObserverExample {
	public static void main(String args[]) {
		System.out.println("Enter Text >");
		
		//이벤트 발행 주체를 생성함 - stdin(System.in)으로부터 문자열을 입력받음//
		final EventSource evSrc = new EventSource();
		
		//옵저버를 생성함//
		final ResponseHandlerOne respHandler = new ResponseHandlerOne();
		final ResponseHandlerTwo respHandler_two = new ResponseHandlerTwo();
	
		//옵저버가 발행 주체가 발행하는 이벤트를 구독하게 함//
		evSrc.addObserver(respHandler);
		evSrc.addObserver(respHandler_two);
		
		System.out.println("** Observer count: " + evSrc.countObservers());
		
		//이벤트를 발생시키는 스레드 시작(Runnable을 implements한 클래스를 대입)//
		Thread thread = new Thread(evSrc);
		thread.start();
	}
}
