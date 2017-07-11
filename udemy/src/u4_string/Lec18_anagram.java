package u4_string;

import java.util.HashMap;

/*
 * �� �ܾ� s1 �� s2�� �־����� ��,
 * s1�� ���ϴ� ���ĺ��� ������ �ٲ� s2�� ���� �� ������
 * ���� ����� anagram�̴�.
 */

/*
 * ���� �ذ� ���: 
 * 1) �� �ܾ��� ���̰� ���ƾ��Ѵ�.
 * 2) �ܾ� ���� ���ĺ��� ������ ���ƾ��Ѵ�.
 * => ������ ������ ����. ������ ������ �߿�ġ ����!
 */
public class Lec18_anagram {

	public static boolean isAnagram(String s1, String s2) {

		//1) �� �ܾ��� ���̰� ���ƾ��Ѵ�.
		if (s1.length() != s2.length()) {
			return false;
		}

		
		//2)������ ������ ��. ���� key�� value ���� ����.
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		//�̹� �����ϴ� ���ڶ��, value���� 1����.
		for (char c : s1.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		//3) s2�� �� ���ڸ� hashmap�� s1�� �� ���ڰ� ��� key��� ��.
		for(char s : s2.toCharArray()){
			
			if(map.containsKey(s) && (map.get(s)!=0)){ //value�� 0�̶��,
				map.replace(s, map.get(s)-1); //�񱳵� ���ڴ� ������ ����
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
