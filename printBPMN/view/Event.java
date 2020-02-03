package view;

import java.awt.*;
import javax.swing.*;

public class Event exteds JFrame{
	private int x;
	private int width;
	private int length;
	public Event(int width, int length){
		x = 50;
		this.width = width;
		this.length = length;
	}

	public void paint(Graphics g){
		g.drawOval(x, x, width, height);
	}
}
