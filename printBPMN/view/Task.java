package view;

class Task{
	int x;
	int y;
	int width;
	int length;
	TextBox tb;

	public Task(String text, int x1, int y1){
		x = x1;
		y = y1;
		width = 126;
		length = 51;	
		tb = new TextBox(text, x + 6, y + 6);
	}
}
