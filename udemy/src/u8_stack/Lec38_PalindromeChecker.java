package u8_stack;

import java.util.Stack;

/*
 * Stack으로 회문(palindrome) 판별하기
	회문이란 순서를 뒤집어도 내용이 같은 것을 의미한다.
	"noon", "level", "civic" 등은 회문이다.

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
