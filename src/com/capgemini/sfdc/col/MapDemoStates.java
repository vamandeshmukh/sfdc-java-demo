package com.capgemini.sfdc.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemoStates {

	public static void main(String[] args) {

		Map<String, String> stateCodes = new HashMap<>();

		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("TS", "Telangana");
		stateCodes.put("KA", "Karnataka");
		stateCodes.put("DL", "Delhi");
		stateCodes.put(null, "Andhra Pradesh");

		System.out.println(stateCodes.get("KA"));
		System.out.println(stateCodes.get(null));

	}

}
