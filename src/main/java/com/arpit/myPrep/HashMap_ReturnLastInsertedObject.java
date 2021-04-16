package com.arpit.myPrep;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ReturnLastInsertedObject {


	@Override
	public int hashCode() {
		return 1;
	}



	@Override
	public boolean equals(Object obj) {
		return true;
	}



	public static void main(String[] args) {
		
		HashMap_ReturnLastInsertedObject a1 = new HashMap_ReturnLastInsertedObject();
		HashMap_ReturnLastInsertedObject a2 = new HashMap_ReturnLastInsertedObject();
		HashMap_ReturnLastInsertedObject a3 = new HashMap_ReturnLastInsertedObject();
		HashMap_ReturnLastInsertedObject a4 = new HashMap_ReturnLastInsertedObject();
		Map<HashMap_ReturnLastInsertedObject, Integer> hashMap = new HashMap<>();
		
		hashMap.put(a1, 100);
		hashMap.put(a2,200);
		hashMap.put(a3,300);
		hashMap.put(a4, 400);
		
		System.out.println(hashMap.size());
		
		
	}

}
