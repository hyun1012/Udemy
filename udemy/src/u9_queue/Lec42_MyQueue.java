package u9_queue;

import java.util.Stack;

/***
 * 두개의 stack으로 큐 구현하기
 */
public class Lec42_MyQueue<T> {
	Stack<T> stack1;
    Stack<T> stack2;
    
    public Lec42_MyQueue() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }
    
    public void offer(T element) {
    	stack1.push(element);
    }
    
    public T poll() {
		return null;
    	
    	
    }
    
    public int size() {
        // ToDo
    	return stack1.size();
    }

    public static <T> void main(String args[]){
    	
    	Lec42_MyQueue<T> qu = new Lec42_MyQueue<>();

    }

}



