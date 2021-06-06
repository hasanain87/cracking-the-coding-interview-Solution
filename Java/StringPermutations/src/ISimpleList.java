
public interface ISimpleList  <E> {
	
	/**
	 * 
	 * @return the list size
	 */
	int size();
	
	
	/**
	 * Add item e to the end of the list
	 * @param e
	 */
	void add(E e);
      
  /**
	 * Print all the elements of the list IN ONE LINE in between square brackets
   * e.g.: [ item1, item2, item3, item4 ]
	 * 
	 */
	void printList();
	
	/**
	 * Get the element at position index
	 * 
	 * @param index
	 * @return
	 */
	E get(int index);
	
	/**
	 * Set the element at position index to the given element
	 * @param index
	 * @param element
	 */
	void set(int index, E element);
	
	
	/**
	 * Add item e at position index
	 * 
	 * @param index
	 * @param element
	 */
	void add(int index, E element);
	
	/**
	 * Remove the item at position index and return the item that was just removed
	 * 
	 * @param index
	 * @return The element which was removed
	 */
	E remove(int index);
}

	
	


