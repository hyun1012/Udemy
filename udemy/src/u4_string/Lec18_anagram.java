package u4_string;

import java.util.HashMap;

/*
 * 두 단어 s1 과 s2가 주어졌을 때,
 * s1에 속하는 알파벳의 순서를 바꿔 s2로 만들 수 있으면
 * 둘의 관계는 anagram이다.
 */

/*
 * 문제 해결 방법: 
 * 1) 두 단어의 길이가 같아야한다.
 * 2) 단어 속의 알파벡의 갯수가 같아야한다.
 * => 문자의 갯수를 비교함. 문자의 순서는 중요치 않음!
 */
public class Lec18_anagram {

	public static boolean isAnagram(String s1, String s2) {

		//1) 두 단어의 길이가 같아야한다.
		if (s1.length() != s2.length()) {
			return false;
		}

		
		//2)문자의 갯수를 셈. 같은 key에 value 값만 증가.
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		//이미 존재하는 문자라면, value값을 1증가.
		for (char c : s1.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		//3) s2의 각 문자를 hashmap의 s1의 각 문자가 담긴 key들과 비교.
		for(char s : s2.toCharArray()){
			
			if(map.containsKey(s) && (map.get(s)!=0)){ //value가 0이라면,
				map.replace(s, map.get(s)-1); //비교된 문자는 갯수를 줄임
			}else{
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String args[]) {

		System.out.println(isAnagram("car", "arc"));
	}

}
