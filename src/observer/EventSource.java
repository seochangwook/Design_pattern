package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable{

	@Override
	public void run() {
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				final String response = br.readLine();
				setChanged();
				notifyObservers(response); //변경된 이슈를 옵저버에게 알려줌//
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
