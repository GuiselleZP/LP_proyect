package view;

public class Gate{
	int constant;
	int x_i[];
	int y_i[];
	TextBox tb;

	public Gate(String text, int x, int y){
		constant = 20;
		x_i = new int[4];
		y_i = new int[4];
		
		x_i[0] = x - constant;
		x_i[1] = x;
		x_i[2] = x + constant;
		x_i[3] = x;

		y_i[0] = y;
		y_i[1] = y - constant;
		y_i[2] = y;
		y_i[3] = y + constant;

		TextBox tb = new TextBox(text, x - 22, y + 22);
	}
}
