package u7_linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Single linked list���� �ߺ� ������ �����ϱ�
 */
public class Lec31_MyList {

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

	@Override
	public String toString() {
		String str = "[ ";
		for (Node n = head; n != null; n = n.next) {
			str += n.data;
			str += " ";
		}
		str += "]";
		return str;
	}

	//�ߺ� ������ �����ϱ�
	public void removeDuplicates() {
		// ToDo

		HashSet<Integer> set = new HashSet<>();
		Node pre = null;
		Node node = head;
		
		while (node!= null) {
			
			if (!set.contains(node.data)) {
				set.add(node.data);
				pre = node; //correct!	 
			} else {
				pre.next = node.next;
			}
			//incorrect! => ���� else�� ��쿡�� node�� next�� ��������.node�� �ҿ���.
			//pre = node; 
			node = node.next;
			
		}
	}
}
