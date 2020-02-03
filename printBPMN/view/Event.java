package view;

public class Event{
	int x;
	int y;
	int diameter;
	TextBox tb;

	public Event(String text, int x, int y){
		this.x = x;
		this.y = y;
		diameter = 30;
		tb = new TextBox(text, x + 15, y + 15);
	}
}
