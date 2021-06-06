
public class RemvDupLinked  <T> implements  ISimpleList <T> {

	private class Node {    //Node class
		T val;
		Node next;
		
		}
	
		private Node front;
		private Node back;
		private int size;
	
	
	//return the size of the List
	@Override
	public int size() {
		
		return size;
	}


	@Override
	public void add(T e) {  // add to back of the List
		// TODO Auto-generated method stub
		
		Node  newNode =new Node(); //create newNode
		newNode.val=e;
		if (front==null){   //if the list is empty hoockup the first node with front and back
			front=newNode;
			back=newNode;
		}
		else {                         //else if not empty 
		back.next=newNode;
		back=newNode;
		}
		size++;            //increase the List size 
		
		
	}




// Print all the elements of the list IN ONE LINE in between square brackets

	@Override
	public void printList() {
	
		StringBuilder  result= new StringBuilder ("[");   // String Array that contains [ and element 
		Node cur=front;
		
		while ( cur !=null){
			for(int i=0;i<size;i++){
				result.append(cur.val);
				cur =cur.next;
				if(cur !=null){
					result.append(",");
				}
				else result.append("]");
				
			}
		}
		System.out.println(result);
		
			
		}
	
	
	//Get the element at position index
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		
		Node temp =front;
		for(int i=0;i<index;i++){
		 temp=temp.next;	
			
			
		}
		

		return temp.val;
	}






	@Override
	public void set(int index, T element) {
		// TODO Auto-generated method stub
		
		Node temp =front;
		for(int i=0;i<index;i++){
		 temp=temp.next;		
		}
		
		temp.val= element;
		 
			
	
	}

   //Add item e to the end of the list
	@Override
	public void add(int index, T element) {
		
		if (index >= size) add(element);
		else{
			Node cur=front;
			for(int i=1;i<index;i++)
			cur =cur.next;
			Node temp=cur.next;
			Node  newNode=new Node();
			cur.next=newNode;
			newNode.val=element;
			(cur.next).next=temp;
			size++;
		}
	}
			
			

	// Remove the item at position index and return the item that was just removed
	@Override
	public T remove(int index) {
		
	if(size==0) return null;
	else  if(index == 0) {
		 T val=front.val;
			
		   front=front.next;
				size--;
			return val;
		}
	else if (index==size-1) return  removeLast();
		else {
		 Node previous =front;
		 for(int i=1;i<index;i++){
			 previous=previous.next; 
		 }
		Node cur=previous.next;
		 previous.next=cur.next;
		 size--;
		return cur.val ;
	}
	
	
	}

	
	public   void delDump(){
		
		Node cur=front;
		while (cur !=null){
			Node Runner=  cur;
			while ( Runner.next!=null){
				
				if( Runner.next.val==cur.val){
					
					Runner.next=Runner.next.next;
				}else{
					
					Runner=Runner.next;
					
				}
			}
			cur=cur.next;
			
		}
		size--;
		
		
	}
	public  T removeLast(){  
		
		Node cur=front;
		for (int i=0;i<size-2;i++)
		//	T v =cur.v;
		cur=cur.next;
		Node temp=back;
		back=cur;
		back.next=null;
		size--;
		return temp.val;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Hello");
		RemvDupLinked<Integer> List= new RemvDupLinked<Integer>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(2);
		List.printList();
		
		List.delDump();
		List.printList();
		
	}
	
	
	
}
