package u7_linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Single linked list에서 중복 데이터 제거하기
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

	//중복 데이터 제거하기
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
			//incorrect! => 위의 else의 경우에서 node의 next를 변경했음.node는 불완전.
			//pre = node; 
			node = node.next;
			
		}
	}
}
