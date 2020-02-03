package view;

class TextBox{
	String text;
	int x;
	int y;
	int width;
	int length;
	
	public TextBox(String text, int x1, int y1){
		x = x1;
		y = y1;
		width = 120;
		length = 45;
		text = processText(text);
	}

	private String processText(String text){
		String newText = "";
		String temp = "";
		int count = 0;
		int aux = 0;
		int aux1 = 0;
		String[] words = text.split(" ");

		for(int i = 0; i < words.length; i++){
			if(count < 15){
				aux = words[i].length();
				if(count == 0){
					temp = words[i] + " ";
					count += aux;
				}else{
					if(count + aux < 15){
						aux1 = count + aux + words[i+1].length();
						if(aux1 < 14){
							temp = words[i] + " ";
							count += aux;
						}else{
							temp = words[i] + "<p>";
							count = 0;
						}
					}
				}
				++ count;
			}
		}
		newText = "<html>" + temp + "<html>";
		return newText;
	}
}
