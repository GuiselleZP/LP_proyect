package view;

public class Gate{
	int constant;
	int coupligPoints[][] = new int[2][4];
	int figurePoints[][] = new int[2][4];
	TextBox tb;

	public Gate(String text, int x, int y){
		constant = 20;
		
		figurePoints[0][0] = x - constant;
		figurePoints[0][1] = x;
		figurePoints[0][2] = x + constant;
		figurePoints[0][3] = x;

		figurePoints[1][0] = y;
		figurePoints[1][1] = y - constant;
		figurePoints[1][2] = y;
		figurePoints[1][3] = y + constant;

		coupligPoints = figurePoints;

		TextBox tb = new TextBox(text, x - 22, y + 22);
	}
}
