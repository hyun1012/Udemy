package u3_basic;

import java.util.HashMap;

public class Lec13_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��Ŭ�������� HashMap�� ����Ϸ��� �ڿ� Key-Value�� �������� ��Ȯ�ϰ� ���ִ� ���� �����ϰ� �ֽ��ϴ�.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("korean", 90);
		map.put("math", 80);
		
		
		System.out.println("korean score: "+ map.get("korean"));
		
		
		
		
	}

}
