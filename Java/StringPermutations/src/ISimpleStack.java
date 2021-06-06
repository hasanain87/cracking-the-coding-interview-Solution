
public interface ISimpleStack <E> {
	
	
	
	/**
	 * True if the stack is empty, false otherwise
	 * 
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * Add item e to the stack
	 * 
	 * @param e
	 */
	void push(E e);
	
	/**
	 * Remove the element at the top of the stack and return it
	 * @return
	 */
	E pop();
	
	/**
	 * Get the element at top of the stack
	 * @return
	 */
	E peek();

	void printList();
}

