package week1;

/**
 * @author Lazarov94
 *
 */
public class Stack {
	private Queue queue;

	public Stack() {
		queue = new Queue();
	}

	public void push(Object value) {
		queue.push(value);
	}

	public void pop() {
		Queue localQueue = new Queue();
		for (int i = 0; i < queue.size(); i++) {
			localQueue.push(queue.pop());
		}
		queue = localQueue;
	}

	public Object peek() {

		Queue localQueue = queue;
		for (int i = 0; i < queue.size() - 1; i++) {
			localQueue.pop();
		}
		return localQueue.peek();
	}

	public int size() {
		return queue.size();
	}

	public void printStack() {
		queue.printQueue();

	}
}
