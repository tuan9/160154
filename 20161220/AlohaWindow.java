import java.awt.*;
import javax.swing.*;
public class AlohaWindow{
	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setSize(500,200);
		frame.setTitle("Tuan!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label=new JLabel("hello");
		Container ctnr=frame.getContentPane();
		ctnr.add(label,BorderLayout.NORTH);
		JButton button=new JButton("click Me!");
		ctnr.add(button,BorderLayout.SOUTH);
		frame.setVisible(true);


			
	}
  }
