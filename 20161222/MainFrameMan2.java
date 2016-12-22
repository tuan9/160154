import java.awt.*;
import javax.swing.*;

public class MainFrameMan2 {
	public static void main(String[] args) {
				FrameMan fm = new FrameMan();

	}
}

class FrameMan{


JFrame frame;
JPanel panel;
JLabel label;
ImageIcon icon;


public FrameMan(){
	System.out.println("aloha2");

		openWindow();
}
private void openWindow(){

	frame.setLocation(400, 400);
	frame.setSize(800,600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	icon = new ImageIcon("1_Desktop_Icons/icon_512.png");
	panel = new JPanel();
	label = new JLabel("icon");
	openWindow();


	panel.add(label);
	label.add(panel);


	frame.setVisible(true);
}
 //public void actionPerformed(ActionEvent e){
 //	label.setText("tuan");
// }
}

