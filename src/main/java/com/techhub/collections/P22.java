package com.techhub.collections;

import java.util.*;

/**
 ==================================================================================================
 Program #22

 Find Highest salary employee from the map as given below.

 1, Highest
 2, 2nd Highest
 3, 3rd Highest
 ...

 Input:
 Map<String,Integer>
 ("Nani", 10000)
 ("Chintu", 20000)
 ("Kanni", 40000)
 ("Harika", 15000)
 ("Srinivas", 15000)
 ("Srini", 20000)

 (Map,1)
 (Map,2)
 (Map,3)

 Output:
 1 = Kanni
 2 = Chintu, Srini
 3 = Harika, Srinivas
 4 = Nani

 ==================================================================================================
 */
public class P22 {

    public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Nani", 10000);
		map.put("Chintu", 20000);
		map.put("Kanni", 40000);
		map.put("Harika", 15000);
		map.put("Srinivas", 15000);
		map.put("Srini", 20000);

		for(int i=1; i<=4; i++) {
			System.out.println(i+" = "+highestSalary(map, i)); 
		}
		
	}

	public static List<String> highestSalary(Map<String,Integer> map, int x){
		List<String> result = new ArrayList<>();		
		List<Integer> sls = map.values().stream().distinct().sorted(Comparator.reverseOrder()).toList();	
		int hsal= sls.get(x-1);
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
		.forEach(e->{
			if(e.getValue()==hsal) {
				result.add(e.getKey());
			}
		});
		return result;
	}
}
