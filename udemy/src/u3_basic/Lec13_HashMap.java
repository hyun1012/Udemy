package u3_basic;

import java.util.HashMap;

public class Lec13_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이클립스에서 HashMap을 사용하려면 뒤에 Key-Value의 변수형을 명확하게 해주는 것을 권장하고 있습니다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("korean", 90);
		map.put("math", 80);
		
		
		System.out.println("korean score: "+ map.get("korean"));
		
		
		
		
	}

}
