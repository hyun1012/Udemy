package u4_string;

import java.util.HashMap;

class Lec20_Frequency {
	/*
	 * 주어진 문서에서 특정 단어의 빈도 자주 구하기. 문서는 단어별로 분리 되어 String 배열로 입력된다. 문서를 읽고나면 여러
	 * 단어들의 빈도에 대해 자주 많이 호출될 수 있음을 고려하여 구현한다.
	 * 
	 */
	public static class WordCount {
		private HashMap<String, Integer> map;

		public WordCount() {
			// TODO Auto-generated constructor stub
			map = new HashMap<String, Integer>();
		}

		public void read(String[] doc) {
			// ToDo

			for (String str : doc) {
				if (map.containsKey(str)) {
					map.put(str, map.get(str) + 1);
				} else {
					map.put(str, 1);
				}
			}
		}

		public int getCount(String word) {
			// ToDo

			// map에 word가 존재하지 않을 경우.
			if (!map.containsKey(word)) {
				return 0;
			}
			return map.get(word);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "a1", "b1", "c1", "d1", "e1", "f1", "g1", "a1", "b1", "c1" };
		/*
		 * WordCount wc = new WordCount();
		 * 오류 ->
		 * "No enclosing instance of type Lec20_Frequency is accessible. Must qualify the allocation with an enclosing instance of type Lec20_Frequency (e.g. x.new A() where x is an instance of Lec20_Frequency)."
		 * (static 함수에서 참조하려는 클래스가 닫혀 있어 접근을 하지 못한다는 오류입니다. 보통 내부에 있는 클래스를 static 함수가 참조할 때 에러가 납니다.
		 * 해결->
		 * public static class WordCount{}
		 */

		WordCount wc = new WordCount();
		wc.read(str);
		System.out.println(wc.getCount("a1"));

	}

}
