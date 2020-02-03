package model;

import java.util.LinkedList;
import java.util.List;

public class ModelInformation{
	List<DataTask> dt = new LinkedList();
	List<DataGates> dg = new LinkedList();
	List<DataEvents> de = new LinkedList();

	List<DataLines> dl = new LinkedList();
	List<String[]> dv = new LinkedList();

	public ModelInformation(List<DataTask> t, List<DataGates> g, List<DataEvents> e, List<DataLines> l, List<String[]> d){
		dt = t;
		dg = g;
		de = e;
		dl = l;
		dv = v;
	}
}
