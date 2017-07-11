package u8_stack;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList�� Stack�� �����Ѵ�.
���ÿ� ������ �������� Ÿ���� ������ �� �ֵ��� ���׸��� �̿��Ͽ� �����Ѵ�.

 */
public class Lec37_MyListStack<T> {
	private List<T> list;

	public Lec37_MyListStack() {
		list = new ArrayList<>();
	}

	public void push(T i) {
		// ToDo
		list.add(i);
	}

	public T pop() {

		if (list.isEmpty()) {
			throw new RuntimeException();
		}
		return list.remove(list.size()-1);
		// ToDo
	}
}
