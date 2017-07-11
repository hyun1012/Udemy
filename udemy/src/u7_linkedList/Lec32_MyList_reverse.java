package u7_linkedList;

/*
 * Single linked list ������
 */

public class Lec32_MyList_reverse {

	public class Node {
		int data;
		Node next;
	}

	private Node head;

	// ������
	public void reverse() {

		Node oldNode = head;
		head = null;

		while (oldNode != null) {
			addToHead(oldNode.data);
			oldNode = oldNode.next;
		}

	}

	
	//�տ������� �߰���.
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
}
