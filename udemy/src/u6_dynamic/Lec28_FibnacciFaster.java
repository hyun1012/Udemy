package u6_dynamic;

public class Lec28_FibnacciFaster {
	public static int fib(int n){
		
		
		if(n<=1){
			return n;
		}
		
		return fib(n-1)+ fib(n-2);
		
	}
	
	public static int fibFaster(int n){
		
		int[] temp = new int[n+1];
		
		if(n<=1){
			return n;
		}
		
		return fib(n-1)+ fib(n-2);
		
	}
}
