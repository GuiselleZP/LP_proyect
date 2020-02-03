package model;

import java.util.LinkedList;
import java.util.List;

public class ModelInformation{
	List<DataTask> dt = new LinkedList();
	List<DataGates> dg = new LinkedList();
	List<DataEvents> de = new LinkedList();

	List<DataLines> dl = new LinkedList();
	List<Variables> dv = new LinkedList();
	List<String> order = new LinkedList();

	public ModelInformation(List<DataTask> t, List<DataGates> g, List<DataEvents> e, List<DataLines> l, List<Variables> d, List<String> o){
		dt = t;
		dg = g;
		de = e;
		dl = l;
		dv = v;
		order = o;
	}
}
