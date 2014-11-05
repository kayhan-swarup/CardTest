import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;


public class Main extends JFrame{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.setSize(300,300);
		m.setLayout(new FlowLayout());
		m.setVisible(true);
		m.setBackground(Color.GREEN);
		m.add(new Card(10,2));
		
	}
	

}
