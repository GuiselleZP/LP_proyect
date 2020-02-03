package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame{
	private int width;
	private int height;
	public Window(int x, int y){
		width = x;
		height = y;
		setMinimumSize(new Dimension(300, 200));
		setSize(width, height);
		setLocationRelativeTo(null);
		setTitle("Diagrama Generado");

		//startComponents();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
