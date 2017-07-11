package u8_stack;

import java.util.Stack;

/*
 * Stack���� ȸ��(palindrome) �Ǻ��ϱ�
	ȸ���̶� ������ ����� ������ ���� ���� �ǹ��Ѵ�.
	"noon", "level", "civic" ���� ȸ���̴�.

 */
public class Lec38_PalindromeChecker {
	
	
	public static boolean isPalindrome(String s) {
		
		Stack<Character> stack = new Stack<>();
		System.out.println(s.length());
		
		
		for (char c : s.toCharArray()) {
			stack.push(c);
			System.out.println(c);
		}
		
		System.out.println("======");
		for (char c : s.toCharArray()) {
			if(stack.pop() != c){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		System.out.println(isPalindrome("levll"));
	}
}
