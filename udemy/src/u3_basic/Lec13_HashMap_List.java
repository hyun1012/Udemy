package u3_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lec13_HashMap_List {

	public static void main(String arg[]){
		
		/*
		 * HashMap으로 데이터 생성 후, List에 저장.
		 */
		
		//list의 객체 타입 설정. Object는 모든 타입 가능.
		List<Object> list = new ArrayList<>();
		
		//이클립스에서 HashMap을 사용하려면 뒤에 Key-Value의 변수형을 명확하게 해주는 것을 권장하고 있습니다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
				
		// 1번째 hashmap
		map.put("korean", 10);
		map.put("math", 20);
		System.out.println("korean score: "+ map.get("korean"));
		
		list.add(map);
		
		// 2번째 hashmap
		map =new HashMap<String, Integer>();
		map.put("korean", 30);
		map.put("math", 40);
		list.add(map);
		
		System.out.println(list);
		//list 저장형태는 LIFO(last input first out).
		//[{math=20, korean=10}, {math=40, korean=30}]

		
	 /*
	  * 데이터 out
	  */
		HashMap getMap = new HashMap();
		
//		getMap = (HashMap)list.get(0);
//		System.out.println("korean score (1): "+ getMap.get("korean"));
//		System.out.println("math score (1): "+ getMap.get("math"));
//		
//		getMap = (HashMap)list.get(1);
//		System.out.println("korean score (2): "+ getMap.get("korean"));
//		System.out.println("math score (2): "+ getMap.get("math"));

		//for문으로 List에서 hashMap타입으로 데이터 불러오기.
		for (int i = 0; i < list.size(); i++) {
			getMap = (HashMap)list.get(i);
			System.out.println("korean score "+ i+ ": "+ getMap.get("korean"));
		}
		
		
		/*
		 * key가 있는 지 검사.
		 */		
		System.out.println(list.contains(getMap));
		System.out.println(getMap.containsKey("history"));
	}
}
