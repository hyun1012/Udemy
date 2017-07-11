package u7_linkedList;

/*
 * Single linked list �����ϱ�.
addToHead(n) :����Ʈ�� head�� ��带 �߰�,node.data�� n���� ����
removeFirst():����Ʈ�� ù ��� ����,������ ���� ������ RuntimeException�� �߻�
 */
public class Lec30_SingleLinkedList {
	public class Node {
		int data;
		Node next;
	}

	private Node head;

	// ����Ʈ�� head�� ��带 �߰�,node.data�� n���� ����
	public void addToHead(int n) {
		// ToDo

		Node node = new Node();
		node.data = n;
		node.next = head;
		head = node;

	}

	// ����Ʈ�� ù ��� ����,������ ���� ������ RuntimeException�� �߻�
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
