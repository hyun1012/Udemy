package u7_linkedList;

import java.util.Stack;

import u7_linkedList.Lec33_MyList_kthToLast.Node;

/*
 * Single linked list���� ȸ��(palindrome) �Ǻ��ϱ�.
 * 1->2->3->2->1 �� ���� ��쿡 ȸ������ �Ǻ��Ѵ�.
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
