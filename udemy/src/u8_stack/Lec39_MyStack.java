package u8_stack;

import java.util.Stack;

/*
 *** Stack 을 구현한다.
 * Stack에 저장된 값들 중 최소값을 반환하는 min() 함수를 O(1)에 구현한다.
push(), pop()도 구현한다.

 */
public class Lec39_MyStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public Lec39_MyStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int newVal) {
		// '<=' 꼭 표시!!
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
