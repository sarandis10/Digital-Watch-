package digitalclock;
import java.util.*;

public class Clock extends Thread {
	DigitalClock digitalClock;
	String time;
	
	public Clock(DigitalClock digitalClock) {
		this.digitalClock=digitalClock;
		start();
	}
	
	public void run() {
		while (true) {
			time=""+new Date();
			digitalClock.clock.setText(time);
		}
	}
}
