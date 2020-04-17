package digitalclock;
import java.awt.*;
import javax.swing.*;

public class DigitalClock extends JFrame{
	JLabel clock;
	Clock cl;

	
	public DigitalClock() {
		clock= new JLabel("Casio");
		setTitle("Saranti's Clock");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(clock);
		setSize(1200,160);
		setLocation(600, 300);
		clock.setFont(new Font("Arial",Font.CENTER_BASELINE,80));
		clock.setOpaque(true);
		clock.setBackground(Color.BLACK);
		clock.setForeground(Color.WHITE);
		cl=new Clock(this);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		DigitalClock dc= new DigitalClock();
		
	}

}
