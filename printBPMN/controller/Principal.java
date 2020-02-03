package controller;

import view.*;
import model.*;
import java.util.LinkedList;
import java.util.List;

public class Principal{
	public static void main(String[] args){
		String[] temp = {"t_hello", "Hello World"};
		
		List variables = new LinkedList();

		List<Elements> el = new LinkedList();
		el.add(new Elements("check", "tk"));
		el.add(new Elements("end_1", "ev"));

		DataLines l1 = new DataLines("l1", "Director", el);
		
		variables.add(temp);

		

		Window w = new Window(600, 400);
		w.setVisible(true);
	}
}
