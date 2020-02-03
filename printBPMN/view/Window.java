package view;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

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

		startComponents();
		validate(); // because you added panel after setVisible was called
        repaint(); // because you added panel after setVisible was called


		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void  startComponents(){
		JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(90,90,30,30);
				g.drawRoundRect(0, 0, 126, 51, 6, 6);

				int[]x = {40, 60, 80, 60};
				int[]y = {60, 40, 60, 80};
				g.drawPolygon(x, y, 4);
            }

        };
		panel.setLayout(null);
		String text = "<html>caificar pruebsa<p>Terreno y Carpa<p>Ingresar<html>";
		JLabel string = new JLabel(text);
		string.setBounds(3, 3, 120, 45);
		string.setHorizontalAlignment(SwingConstants.CENTER);
		//string.setOpaque(true);
		//string.setBackground(Color.BLACK);

		panel.add(string);
		
		this.getContentPane().add(panel);

	}
}
