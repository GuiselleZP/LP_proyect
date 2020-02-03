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
				
				g.drawOval(100, 185, 30, 30);

				g.drawLine(130, 200, 180, 200);

				g.drawRoundRect(180, 174, 100, 52, 6, 6);
				
				g.drawLine(280, 200, 320, 200);

				g.drawRoundRect(320, 174, 100, 52, 6, 6);

				g.drawLine(420, 200, 470, 200);

				g.drawOval(470, 185, 30, 30);

				int x_t = 40;
				int y_t = 100;
				int ln = 200;
				int wd = 500;
				int tl = 40;
				int[]x1 = {x_t + tl, x_t + tl, x_t, x_t, x_t + wd, x_t + wd, x_t + tl};
				int[]y1 = {y_t + ln, y_t, y_t, y_t + ln, y_t + ln, y_t, y_t};
				g.drawPolygon(x1, y1, 7);

            }

        };
		panel.setLayout(null);
		String text = "<html>Solicitar viaje<html>";
		JLabel string = new JLabel(text);
		string.setBounds(190, 180, 94, 45);
		string.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(string);
		
		text = "<html>Solicitud aprobada<html>";
		string = new JLabel(text);
		string.setBounds(330, 180, 94, 45);
		string.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(string);


		
		string = new JLabel("Inicio");
		string.setBounds(95, 220, 40, 15);
		string.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(string);
	
		string = new JLabel("Fin");
		string.setBounds(470, 220, 30, 15);
		string.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(string);
		
		string = new JLabel("<html>S<p>O<p>L<p>I<p>C<p>I<p>T<p>U<p>D<html>");
		string.setBounds(48, 110, 15, 200);
		string.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(string);
	

		this.getContentPane().add(panel);

	}
}
