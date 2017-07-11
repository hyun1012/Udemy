package u7_linkedList;

/*
 * Single linked list에서 뒤에서 K번째 원소를 반환하는 함수를 구현한다.
맨 끝 원소는 0번째 원소이다.

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

    //뒤에서 K번째 원소를 반환하는 함수를 구현한다. 맨 끝 원소는 0번째 원소이다.
    //=> 시작이 0번째인지 1번째인지 중요!
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
