package u3_basic;

import java.util.Scanner;

public class Lecture11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		
		int[] int1 = new int[4]; 
		for (int i = 0; i < int1.length; i++) {
			//띄어쓰기로 구분
			int1[i] = sc.nextInt();
		}
		
		for (int i : int1) {
			System.out.println(i);
		}
		
		
//		char[] arr2 = int_c.toCharArray();
//		
//		for (char c : arr2) {
//			System.out.println(c);
//		}
		
	}

}
