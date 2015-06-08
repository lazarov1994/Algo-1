/**
 * 
 */
package week1;

/**
 * @author Lazarov94
 *
 */
public class MyNode {

	private Object data;
	private MyNode next;
	private MyNode prev;

	public MyNode(Object data, MyNode next, MyNode prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public MyNode(Object data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public Object getData() {
		return this.data;
	}

	public MyNode getNextNode() {
		return this.next;
	}

	public MyNode getPrevNode() {
		return this.prev;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNextNode(MyNode next) {
		this.next = next;
	}

	public void setPrivNode(MyNode prev) {
		this.prev = prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
