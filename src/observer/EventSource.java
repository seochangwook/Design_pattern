package observer;

/*
 * Observable : 등록된 옵저버 관리, 새로운 데이터 요청 시 등록된 옵저버들에게 데이터 전달
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable{
	private Test test;
	
	@Override
	public void run() {
		test = new Test("seo");
		
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				final String response = br.readLine();
				
				if(response.equals("change")) {
					this.test.setName("chang"); //객체의 필드 변경//
					
					objectFieldChanged(); //변경된 사항을 등록된 옵저버에 notify//
				} else {
					System.out.println("\nCurrent Name : " + this.test.getName());
				}			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void objectFieldChanged() {
		setChanged();
		notifyObservers(this.test); //변경된 이슈를 옵저버에게 알려줌(객체를 파라미터로 전달)//
	}

}
