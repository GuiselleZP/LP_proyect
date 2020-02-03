package view;

import java.awt.*;
import javax.swing.*;

public class Event extends JFrame{
	int x;
	int width;
	int length;
	public Event(int width, int length){
		x = 50;
		this.width = width;
		this.length = length;
		Graphics g = new Graphics();
		paint(g);
	}

	public void paint(Graphics g){
		g.drawOval(x, x, width, length);
	}
}
