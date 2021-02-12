package com.arpit.general;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestNSmallest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(2);
		list.add(52);
		list.add(20);
		list.add(92);
		list.add(15);
	
		Collections.sort(list);
		Object[] o = list.toArray();
		System.out.println("Smallest"+o[0]);
		System.out.println("Largest"+o[o.length-1]);

	}

}
