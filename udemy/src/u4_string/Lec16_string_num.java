package u4_string;

public class Lec16_string_num {

	public static void main(String arg[]){
		
		char[] ch = "123".toCharArray();
		int num = 0;
		
		//123
		//1*10 +2 = 12
		//12*10 +3 = 123
		
		for (char c : ch) {
			num*=10;
			num+= c - '0'; //문자에서 숫자로.
		}
		
		System.out.println(num);
	}
}
