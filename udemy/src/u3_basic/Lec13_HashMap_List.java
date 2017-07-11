package u3_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lec13_HashMap_List {

	public static void main(String arg[]){
		
		/*
		 * HashMap���� ������ ���� ��, List�� ����.
		 */
		
		//list�� ��ü Ÿ�� ����. Object�� ��� Ÿ�� ����.
		List<Object> list = new ArrayList<>();
		
		//��Ŭ�������� HashMap�� ����Ϸ��� �ڿ� Key-Value�� �������� ��Ȯ�ϰ� ���ִ� ���� �����ϰ� �ֽ��ϴ�.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
				
		// 1��° hashmap
		map.put("korean", 10);
		map.put("math", 20);
		System.out.println("korean score: "+ map.get("korean"));
		
		list.add(map);
		
		// 2��° hashmap
		map =new HashMap<String, Integer>();
		map.put("korean", 30);
		map.put("math", 40);
		list.add(map);
		
		System.out.println(list);
		//list �������´� LIFO(last input first out).
		//[{math=20, korean=10}, {math=40, korean=30}]

		
	 /*
	  * ������ out
	  */
		HashMap getMap = new HashMap();
		
//		getMap = (HashMap)list.get(0);
//		System.out.println("korean score (1): "+ getMap.get("korean"));
//		System.out.println("math score (1): "+ getMap.get("math"));
//		
//		getMap = (HashMap)list.get(1);
//		System.out.println("korean score (2): "+ getMap.get("korean"));
//		System.out.println("math score (2): "+ getMap.get("math"));

		//for������ List���� hashMapŸ������ ������ �ҷ�����.
		for (int i = 0; i < list.size(); i++) {
			getMap = (HashMap)list.get(i);
			System.out.println("korean score "+ i+ ": "+ getMap.get("korean"));
		}
		
		
		/*
		 * key�� �ִ� �� �˻�.
		 */		
		System.out.println(list.contains(getMap));
		System.out.println(getMap.containsKey("history"));
	}
}
