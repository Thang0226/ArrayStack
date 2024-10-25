public class MyStack {
	private final int[] arr;
	private final int capacity;
	private int size = 0;

	public MyStack(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public void push(int element) {
		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}
		arr[size] = element;
		size++;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is null");
		}
		return arr[--size];
	}
}
