package week1;

/**
 * @author Lazarov94
 *
 */
public interface DoublyLinkedListI {
	public int indexOf(Object data);

	public boolean contains(Object data);

	public int size();

	public boolean isEmpty();

	public Object addIndex(int i, Object data);

	public Object addFirst(Object data);

	public Object addLast(Object data);

	public Object getIndex(int i);

	public Object getFirst();

	public Object getLast();

	public Object removeIndex(int i);

	public Object removeFirst();

	public Object removeLast();

}
