package u5_reflection;

public class Lec23_Painter {
	/*
	 * 이미지에서 닫힌 영역 단색 칠하는 함수 구현하기.그림판 프로그램의 영역 칠하기 기능을 생각하면 이해에 도움이 될 것이다. 매개변수중
	 * x, y를 색을 칠하기 시작하는 위치이다. x, y 위치의 색과 같은 색만 칠한다. "newC"는 새로 칠할 색상의 값이다.
	 * 
	 * =>
	 * 
	 */
	public static void paint(int[][] image, int x, int y, int newC) {
		
		
	}
	
	public static void print(int[][] image){
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		
		int[][] img = new int[7][7];
		print(img);
		
		
		paint(img,3,3,1);
		print(img);
		
	}
}
