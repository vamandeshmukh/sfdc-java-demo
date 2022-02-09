package com.capgemini.sfdc.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();

		map.put(10, 100);
		map.put(20, 200);
		map.put(30, 300);
		map.put(40, 400);

		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get(20));

	}

}
