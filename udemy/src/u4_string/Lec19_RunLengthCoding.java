package u4_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lec19_RunLengthCoding {

	/*
	 * <<어려웡
	 * Run Length Coding 으로 문자열 압축하기 (글자+반복수)로 압축한다. 예: "aaabbcccc" -> "a3b2c4"
	 */

	public static String coding(String s) {

		if (s == null) {
			return null;
		}

		HashMap<Character, Integer> map = new HashMap();
		String result = "";

		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		char[] text = new char[map.size()];
		int i = 0;
		text[i] = s.toCharArray()[0];

		for (char c : s.toCharArray()) {
			if (text[i] != c) {
				i++;
				text[i] = c;				
			}
		}

		for (char c : text) {
			if (!map.containsKey(c)) {
				return null;
			}

			result += c + "" + map.get(c);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coding("aaabbcccc"));
	}

}
