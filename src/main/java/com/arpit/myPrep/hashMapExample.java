package com.arpit.myPrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapExample {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  HashMap<Integer, String> hm = new HashMap<Integer,String>();
  hm.put(0, "hello");
  hm.put(1, "goodbye");
  hm.put(42, "morning");
  hm.put(3, "evening");
  System.out.println(hm.get(42));
  hm.remove(42);
  System.out.println(hm.get(42));

  for(Entry<Integer, String> ele: hm.entrySet()) {
	  System.out.println(ele.getKey()+" "+ele.getValue());
  }
  
 }

}
