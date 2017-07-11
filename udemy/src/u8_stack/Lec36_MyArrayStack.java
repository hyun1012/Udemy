package u8_stack;

/*
 *배열로 stack을 구현한다.
내부 배열을 크기는 100으로 시작하지만 더 크게 필요하다면 2배씩 크기를 늘린다.
pop을 할 때, 제거할 데이터가 없다면 RuntimeException을 발생한다.

 */
public class Lec36_MyArrayStack {
	private int[] data = new int[100];
	private int topIndex = -1;

	public void push(int i) {
		// ToDo
		if (data.length  == topIndex-1) {
			int[] oldData = data;
			data = new int[data.length*2];
			System.arraycopy(oldData, 0, data, 0, oldData.length);
			
		} else {
			data[++topIndex] = i;
		}
	}

	public int pop() {

		if (topIndex < 0) {
			throw new RuntimeException("Noting to pop)");
		}
		
		return data[topIndex--];
	}
}
