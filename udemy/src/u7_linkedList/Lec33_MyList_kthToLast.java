package u7_linkedList;

/*
 * Single linked list���� �ڿ��� K��° ���Ҹ� ��ȯ�ϴ� �Լ��� �����Ѵ�.
�� �� ���Ҵ� 0��° �����̴�.

 */

public class Lec33_MyList_kthToLast {
	
	public class Node {
	    int data;
	    Node next;
	}
	
    private Node head;
    private int cnt = 0;
    
    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
        cnt++;
    }

    //�ڿ��� K��° ���Ҹ� ��ȯ�ϴ� �Լ��� �����Ѵ�. �� �� ���Ҵ� 0��° �����̴�.
    //=> ������ 0��°���� 1��°���� �߿�!
    public Node kthToLast(int k) {
    	if(k<0){
    		return null;
    	}

    	Node node = head;
    	int num = cnt -k;
    	
    	for (int i = 1; i < num; i++) {
    		node = node.next;
		}
    	
    	return node;
    }
}
