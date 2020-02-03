package view;

public class Arrow{
	int x1;
	int x2;
	int y1;
	int y2;
	int coupligPoints[][] = new int[2][22];
	TextBox tb; 

	public Arrow(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

		coupligPoints[0][0] = x1;
		coupligPoints[0][1] = x2;

		// (#, y)
		coupligPoints[1][0] = y1;
		coupligPoints[1][1] = y2;

	}
}
