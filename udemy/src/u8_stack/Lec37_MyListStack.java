package u8_stack;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList로 Stack을 구현한다.
스택에 저장할 데이터의 타입을 설정할 수 있도록 제네릭을 이용하여 구현한다.

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
