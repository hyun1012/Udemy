package u5_reflection;

public class Lec23_Painter {
	/*
	 * �̹������� ���� ���� �ܻ� ĥ�ϴ� �Լ� �����ϱ�.�׸��� ���α׷��� ���� ĥ�ϱ� ����� �����ϸ� ���ؿ� ������ �� ���̴�. �Ű�������
	 * x, y�� ���� ĥ�ϱ� �����ϴ� ��ġ�̴�. x, y ��ġ�� ���� ���� ���� ĥ�Ѵ�. "newC"�� ���� ĥ�� ������ ���̴�.
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
