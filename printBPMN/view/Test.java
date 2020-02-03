package view;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame{
	public static void main(String[] str){
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 400);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(40,40,200,200);
                g.drawOval(40,40,100,200);
            }
        };
        frame.add(panel);

        frame.validate(); // because you added panel after setVisible was called
        frame.repaint(); // because you added panel after setVisible was called
	}
}
