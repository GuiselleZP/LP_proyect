package view;

import java.awt.*;
import javax.swing.*;

public class Test{
   public static void main(String[] a) {
	   MyJFrame mj = new MyJFrame();
   }

   static class MyJFrame extends JFrame{
	   public MyJFrame(){
		  Event ev = new Event(150, 100);

		  setSize(700, 500);
		  setLocationRelativeTo(null);
		  setTitle("Test figures");
		  setMinimumSize(new Dimension(300, 200));
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	  setVisible(true);

	   }
   }
}
