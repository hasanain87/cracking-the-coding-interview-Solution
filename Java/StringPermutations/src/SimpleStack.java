/*
 * 
AL_SABONCHI_HASANAIN 
 * 
 * 
 */

import java.awt.List;

public class SimpleStack <T>   implements ISimpleStack<T>{
	
	//SinglyLinkedList  list = new  SinglyLinkedList  ();
	SinglyLinkedList  list ;
	int size=0;
		
	// check if the Stack is Empty, its checking the size
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	// increase the size then call add method  
	@Override
	public void push(T e) {
		size++;
		list.add(e);

		
			
	}

	// remove from list by calling remove method
	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		size--;
	return (T) list.removeLast();
	}
	

	@Override
	public T peek() {
		// look at the top by calling the get method
		
		return  (T)list.get(size-1);
	}
	
	public void printList() {
		
	list.printList();
	}
	
	
	public static  void main(String[] args) {
	
		ISimpleStack<String> stack = new SimpleStack<String>();
		stack.push("hasan");
		stack.push("alsabonchi");
		stack.pop();
		
	//SinglyLinkedList <String> list= new SinglyLinkedList<String>();
	////list.add("hasanain");
	//list.add("Taher");
    //list.add("haj Mohahmad");
    //list.add("alsabonchi");
    //list.add(1,"taher");
    //list.removeLast();
    //list.printList();
  // String result =list.remove(2);
   //System.out.println(result);
    //list.set(1,"Fadhil");
   //String RetElem=list.get(3);
   //System.out.println(RetElem);
   stack. printList() ;
   System.out.print(stack.isEmpty());
	
	
}

	


	

}
