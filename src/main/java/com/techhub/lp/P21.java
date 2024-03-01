package com.techhub.lp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 ==================================================================================================
 Program #21 Print permutation of a String
 --------------------------------------------------------------------------------------------------
Example
		   RAM
	       ARM
	       MAR
	       MRA
	       AMR
     	   RMA
 ==================================================================================================
*/
public class P21 {

	public static void main(String[] args) {
		String s1="RAM";
		Set<String> permutations=getPermutation(s1);
		permutations.forEach(permutation -> {
			System.out.println(permutation);
		});
	}

	/**
	 * Get the Denominator
	 * 
	 * @param s1
	 * @return
	 */
	private static int getDenominator(String s1) {
		Map<Object, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int count = 0;
			for (int j = 0; j < s1.length(); j++) {
				char c2 = s1.charAt(j);
				if (c == c2) {
					count++;
				}
			}
			if (count > 1) {
				map.put(c, count);
			}
		}
		int denominator = 1;
		Set<Object> keys = map.keySet();
		for (Object key : keys) {
			Integer value = map.get(key);
			denominator = denominator * (getFactorial(value));
		}
		return denominator;
	}

	/**
	 * Get the factorial of number
	 * 
	 * @param number
	 * @return
	 */
	private static int getFactorial(int number) {
		int factorial = 1;
		while (number > 1) {
			factorial *= number;
			number--;
		}
		return factorial;
	}

	/**
	 * Count how many possible permutation are there
	 * 
	 * @param s1
	 * @return
	 */
	private static int countNumberOfPermutation(String s1) {
		int nominator = getFactorial(s1.length());
		int denominator = getDenominator(s1);
		return (nominator / denominator);
	}

	private static Set<String> getPermutation(String s1) {
		List<String> permutations = new ArrayList<>();
		permutations.add(s1);
		int x = countNumberOfPermutation(s1);
		int pIndex = 0;
		while (x > 0) {
			String currentPer = permutations.get(pIndex);
			char[] cArr = currentPer.toCharArray();
			for (int i = 0; i < cArr.length;) {
				for (int j = 0; j < cArr.length; j++) {
					if (i != j) {
						char c1 = cArr[i];
						char c2 = cArr[j];
						cArr[i] = c2;
						cArr[j] = c1;
						String per = new String(cArr);
						permutations.add(per);
					}
				}
				pIndex++;
				break;
			}
			x--;
		}
		Set<String> set = new HashSet<>();
		permutations.forEach(permutation -> {
			set.add(permutation);
		});
		return set;
	}
}
