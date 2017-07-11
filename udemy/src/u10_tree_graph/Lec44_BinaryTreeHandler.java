package u10_tree_graph;
/**
 * Binary Tree���� �ִ밪 ã��
 ��� ��尡 ���� ������ ������ �����Ѵ�.
 */

public class Lec44_BinaryTreeHandler {
	
	public class Node {
	    int data;
	    Node left;
	    Node right;
	    
	    public Node() {}
	    public Node(int n) {
	        data = n;
	    }
	    
	    public Node(int n, Node l, Node r) {
	        data = n;
	        left = l;
	        right = r;
	    }
	}
	
    public static int getMax(Node head) {
//    	if(head == null){
//    		return Integer.MIN_VALUE;
//    	}
//    	
//    	//��� ȣ�� 
//    	int leftMax = getMax(head.left);
//    	int rightMax = getMax(head.right);
//    	int childMax = Math.max(leftMax,rightMax);
//    	
//    	
//		return Math.max(childMax, head.data);
//        // ToDo
    	
    	if(head == null){
    		return 0;
    	}
    	int leftMax = getMax(head.left);
    	int rightMax = getMax(head.right);
    	
    	int ultMax = leftMax > rightMax ? leftMax : rightMax;
    
    	return head.data>ultMax? head.data: ultMax;
    }
    
  
}
