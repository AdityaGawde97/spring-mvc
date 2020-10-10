package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Mango");
		hm.put(2, "Apple");
		hm.put(3, "Melon");
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
