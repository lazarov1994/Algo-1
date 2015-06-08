/**
 * 
 */
package week1;

/**
 * @author Lazarov94
 *
 */
public class Vector {

	private Object[] arrayOfObjects;
	private int numberOfElements;
	private int capacity;
	private int lastElementPointer;

	// Adds value at a specific index in the Vector.
	// Complexity: O(n)

	public Vector() {
		numberOfElements = 0;
		capacity = 8;
		lastElementPointer = -1;
		arrayOfObjects = new Object[capacity];

	}

	public void insert(int index, Object value) {
		if (numberOfElements == capacity) {
			// double the size of the array(Vector)
			Object[] doubleSizeArray = new Object[this.capacity * 2];
			for (int i = 0; i < index; i++) {
				doubleSizeArray[i] = arrayOfObjects[i];
			}
			doubleSizeArray[index] = value;
			for (int i = index + 1; i <= arrayOfObjects.length; i++) {
				doubleSizeArray[i] = arrayOfObjects[i - 1];
			}
			arrayOfObjects = new Object[doubleSizeArray.length]; // capacity*2
			for (int i = 0; i < arrayOfObjects.length; i++) {
				arrayOfObjects[i] = doubleSizeArray[i];
			}
			this.capacity = capacity * 2; // or arrayOfObjects.length();
			numberOfElements++;
		} else {
			for (int i = numberOfElements; i != index; i--) {

				arrayOfObjects[i] = arrayOfObjects[i - 1];
			}
			arrayOfObjects[index] = value;
		}
		lastElementPointer++;
		numberOfElements++;
	}

	// Adds value to the end of the Vector.
	// Complexity: O(1)
	public void add(Object value) {
		if (numberOfElements == capacity) {
			Object[] doubleSizeArray = new Object[this.capacity * 2];

			for (int i = 0; i < arrayOfObjects.length; i++) {
				doubleSizeArray[i] = arrayOfObjects[i];
			}
			doubleSizeArray[arrayOfObjects.length] = value;

			arrayOfObjects = new Object[doubleSizeArray.length]; // capacity*2
			for (int i = 0; i < arrayOfObjects.length; i++) {
				arrayOfObjects[i] = doubleSizeArray[i];
			}
			this.capacity = capacity * 2; // or arrayOfObjects.length();

		} else {
			arrayOfObjects[lastElementPointer + 1] = value;
		}
		lastElementPointer++;
		numberOfElements++;
	}

	// Returns value at a specific index in the Vector
	// Complexity: O(1)
	public Object get(int index) {

		return arrayOfObjects[index];
	}

	// Removes element at the specific index
	// Complexity: O(n)
	public void remove(int index) {
		for (int i = index; i < numberOfElements; i++) {
			arrayOfObjects[i] = arrayOfObjects[i + 1];
		}
		lastElementPointer--;
	}

	// Removes element at the last index
	// Complexity: O(1)
	Object pop() {
		lastElementPointer--; // we don't care about the last element. We will
								// override anyway
		return arrayOfObjects[lastElementPointer + 1];
	}

	// Returns the number of elements in the Vector.
	// Complexity: O(1)
	public int size() {
		return lastElementPointer + 1;
	}

	public boolean isEmpty() {

		return size() == 0;
	}

	// Returns the total capacity of the Vector.
	// Complexity: O(1)
	public int capacity() {
		return this.capacity;
	}
}
