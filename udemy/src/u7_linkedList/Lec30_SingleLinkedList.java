package u7_linkedList;

/*
 * Single linked list 구현하기.
addToHead(n) :리스트의 head에 노드를 추가,node.data는 n으로 설정
removeFirst():리스트의 첫 노드 제거,제거할 것이 없으면 RuntimeException을 발생
 */
public class Lec30_SingleLinkedList {
	public class Node {
		int data;
		Node next;
	}

	private Node head;

	// 리스트의 head에 노드를 추가,node.data는 n으로 설정
	public void addToHead(int n) {
		// ToDo

		Node node = new Node();
		node.data = n;
		node.next = head;
		head = node;

	}

	// 리스트의 첫 노드 제거,제거할 것이 없으면 RuntimeException을 발생
	public void removeFirst() {
		// ToDo
		if (head == null) {
			throw new RuntimeException("error");
		}
		head = head.next;
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
}
