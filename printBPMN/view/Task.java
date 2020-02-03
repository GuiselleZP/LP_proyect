package view;

class Task{
	int x;
	int y;
	int width;
	int length;
	int coupligPoints[][] = new int[2][4];
	
	TextBox tb;

	public Task(String text, int x1, int y1){
		x = x1;
		y = y1;
		width = 126;
		length = 52;	
		
		// (x, #)
		coupligPoints[0][0] = x;
		coupligPoints[0][1] = x + (width / 2);
		coupligPoints[0][2] = x + width;
		coupligPoints[0][3] = x + (width / 2);

		// (#, y)
		coupligPoints[1][0] = y + (length / 2);
		coupligPoints[1][1] = y;
		coupligPoints[1][2] = y + (length / 2);
		coupligPoints[1][3] = y + length;

		tb = new TextBox(text, x + 6, y + 6);
	}
}
