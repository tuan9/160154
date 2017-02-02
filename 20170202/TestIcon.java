import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TestIcon {
    public static void main(String[] args) {
        PictureForm app = new PictureForm();

    }
}

class PictureForm
{
    JFrame frame;
    JLabel lbImg;
    String[] images = {"gau.jpg", "gau2.jpg"};
    int idx = 0;

    public PictureForm()
    {
        frame = new JFrame("Picture Change");
        frame.setLocation(200, 200);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel pnAll = new JPanel();

        lbImg = new JLabel();
        lbImg.setIcon(new ImageIcon("slark.jpg"));
        lbImg.setPreferredSize( new Dimension( 500, 500 ) );
        JButton btnChange = new JButton("Click");

        ActionListener saveActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("action");
                idx++;
                if (idx >= images.length) {
                    idx = 0;
                }
                String name = images[idx];
                lbImg.setIcon(new ImageIcon(name));
            }
        };

        btnChange.addActionListener(saveActionListener);

        pnAll.add(lbImg);
        pnAll.add(btnChange);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(1, 2));
        con.add(pnAll);

        // set active
        frame.setVisible(true);
    }
}