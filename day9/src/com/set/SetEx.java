package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SetEx {

	private static Comparator MainSet;

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet(MainSet);
		ts.add("name");
		ts.add("cid");
		ts.add("cadd");
		System.out.println(ts);
		


	}

}
