package u9_queue;

import java.util.Queue;
import java.util.Stack;

/*
 * �������� ť ���� ������
 */
public class Lec41_ReverseQueue<T> {
	 public  Queue<T> reverse(Queue<T> q){

		 Stack<T> stack = new Stack<>();
		 
		 
		 while(!q.isEmpty()){
			 stack.push(q.poll());
		 }
		 while(!stack.isEmpty()){
			 q.offer(stack.pop());
		 }
			 
		 return q;
	 }
}
