package u9_queue;

import java.util.Queue;
import java.util.Stack;

/*
 * 스택으로 큐 순서 뒤집기
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
