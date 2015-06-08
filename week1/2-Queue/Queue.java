package week1;

/**
 * @author Lazarov94
 *
 */
public class Queue {
	private DoublyLinkedList list;

	public Queue() {
		list = new DoublyLinkedList();
	}

	public void push(Object value) {
		list.addLast(value);
	}

	public Object pop() {
		Object local = list.removeFirst();
		return local;
	}

	public Object peek() {
		return list.getFirst();
	}

	public int size() {
		return list.size;
	}

	public void printQueue() {
		for (int i = 0; i < list.size; i++) {
			System.out.println(list.getIndex(i));
		}
	}
}
