package u4_string;

import java.util.HashMap;

class Lec20_Frequency {
	/*
	 * �־��� �������� Ư�� �ܾ��� �� ���� ���ϱ�. ������ �ܾ�� �и� �Ǿ� String �迭�� �Էµȴ�. ������ �а��� ����
	 * �ܾ���� �󵵿� ���� ���� ���� ȣ��� �� ������ ����Ͽ� �����Ѵ�.
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

			// map�� word�� �������� ���� ���.
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
		 * ���� ->
		 * "No enclosing instance of type Lec20_Frequency is accessible. Must qualify the allocation with an enclosing instance of type Lec20_Frequency (e.g. x.new A() where x is an instance of Lec20_Frequency)."
		 * (static �Լ����� �����Ϸ��� Ŭ������ ���� �־� ������ ���� ���Ѵٴ� �����Դϴ�. ���� ���ο� �ִ� Ŭ������ static �Լ��� ������ �� ������ ���ϴ�.
		 * �ذ�->
		 * public static class WordCount{}
		 */

		WordCount wc = new WordCount();
		wc.read(str);
		System.out.println(wc.getCount("a1"));

	}

}
