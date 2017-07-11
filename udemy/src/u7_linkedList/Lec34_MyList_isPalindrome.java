package u7_linkedList;

import java.util.Stack;

import u7_linkedList.Lec33_MyList_kthToLast.Node;

/*
 * Single linked list에서 회문(palindrome) 판별하기.
 * 1->2->3->2->1 와 같은 경우에 회문으로 판별한다.
 */
public class Lec34_MyList_isPalindrome {
	public class Node {
		int data;
		Node next;
	}

	private Node head;

	public void addToHead(int n) {
		Node newNode = new Node();
		newNode.data = n;
		newNode.next = head;
		head = newNode;
	}

	public boolean isPalindrome() {
		// ToDo
		
		Node node = head;
		Node palNode = null;
		
		Stack<Integer> stack = new Stack<>();
		
		while(node !=null){
			stack.push(node.data);
			node = node.next;
		}

		
		for (int i = 0; i < stack.size(); i++) {
			
			
		}
		
	return true;
	}
}
