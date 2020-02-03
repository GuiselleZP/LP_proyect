package view;

public class Event{
	int x;
	int y;
	int diameter;
	int coupligPoints[][] = new int[2][4];
	TextBox tb;

	public Event(String text, int x, int y){
		this.x = x;
		this.y = y;
		diameter = 30;
	
		// (x, #)
		coupligPoints[0][0] = x;
		coupligPoints[0][1] = x + (diameter / 2);
		coupligPoints[0][2] = x + diameter;
		coupligPoints[0][3] = x + (diameter / 2);

		// (#, y)
		coupligPoints[1][0] = y + (diameter / 2);
		coupligPoints[1][1] = y;
		coupligPoints[1][2] = y + (diameter / 2);
		coupligPoints[1][3] = y + diameter;



		tb = new TextBox(text, x, y + 35);
	}
}
