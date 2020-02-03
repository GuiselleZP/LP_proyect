package model;

import java.util.LinkedList;
import java.util.List;

public class DataLines{
	String idLine;
	String name;

	List<Elements> elements = new LinkedList();

	public DataLines(String id, String nameLine, List<Elements> el){
		idLine = id;
		name = nameLine;
		elements = el; 
	}
}
