package u8_stack;

/*
 *�迭�� stack�� �����Ѵ�.
���� �迭�� ũ��� 100���� ���������� �� ũ�� �ʿ��ϴٸ� 2�辿 ũ�⸦ �ø���.
pop�� �� ��, ������ �����Ͱ� ���ٸ� RuntimeException�� �߻��Ѵ�.

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
