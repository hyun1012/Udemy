package u8_stack;

import java.util.Stack;

/*
 *** Stack �� �����Ѵ�.
 * Stack�� ����� ���� �� �ּҰ��� ��ȯ�ϴ� min() �Լ��� O(1)�� �����Ѵ�.
push(), pop()�� �����Ѵ�.

 */
public class Lec39_MyStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public Lec39_MyStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int newVal) {
		// '<=' �� ǥ��!!
		if(minStack.isEmpty() || newVal <= minStack.peek()){
			minStack.push(newVal);
		}
		stack.push(newVal);
	}

	public int pop() {
		if(!minStack.isEmpty() && stack.peek() == minStack.peek()){
			minStack.pop();
		}
		return stack.pop();
	}

	public int min() {
		
		return minStack.peek();
	}
}
