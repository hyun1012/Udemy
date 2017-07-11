package u4_string;

import java.util.HashSet;

public class Lec17_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 주어진 문자열에서 모든 문자가 유일한지 판단하기	
			"abcd" -> true
			"abca" -> false
		 */

		HashSet<Character> set = new HashSet<Character>();
		char[] ch = "abad".toCharArray();

		for(char c : ch){
			if(set.contains(c)){
				System.out.println("false");
			}
			set.add(c);
		}
		System.out.println("true");
	}
}
