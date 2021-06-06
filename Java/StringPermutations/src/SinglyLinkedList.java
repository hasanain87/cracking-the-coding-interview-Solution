import TestSolution.ArrayList;

/*AL_SABONCHI_HASANAIN
 * 
 * 
 * 
 */
public class SinglyLinkedList <T> implements  ISimpleList <T> {
		
	private class Node {    //Node class
		T val;
		Node next;
		
			Node(T val){	
			this.val=val;		
			  }
		
		
		}


	// static ISimpleList <T> list;
	
	
		private Node front;
		private Node back;
		private   int size;
		
	//return the size of the List
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public void add(T e) {  
		// add to back of the List
				Node n=new Node(e);
				
				size++;
		      if(front==null){
		        front=n;
		         back=n;
		         //back.next=n;	
		      }
		      else
		      {
		         back.next=n;
	             back=n;
	      }			
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
		 Node cur=front;
			for(int i=0;i<index;i++){
				cur=cur.next;
				
			}
			return cur.val;
			


		
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void set(int index, T element) {
		// TODO Auto-generated method stub
		 Node cur=front;
		for(int i=0;i<index;i++){
			cur=cur.next;
			
		}
		cur.val=element;
		
	}

   //Add item e to the end of the list
	@Override
	public void add(int index, T element) {
		Node n=new Node(element);
		
		size++;
      Node prev=front;
      Node cur=front;
		for(int i=0;i<index-1;i++)
		{
		prev=prev.next;
        cur=cur.next;
		}
		
	    cur=cur.next;
		prev.next=n;
        n.next=cur;	
       }
			
			
	// Remove the item at position index and return the item that was just removed
	@Override
	public T remove(int index) {
		  Node cur=front;	
			Node after= front;
		
			for(int i=0;i<index-1;i++){
				cur=cur.next;
				after=after.next;
					 	}
					after=after.next;
				
					cur.next=after.next;
					T value=after.val;
	           size--;
	            
		     		return value;	
	  	  }
	
	
	public  T removeLast(){
	
	      /*Node cur=front;
	      Node temp=front;
			for(int i=0;i<size-2;i++)
	      cur=cur.next;	
	      temp=temp.next;
		
	       temp=cur.next;
	      cur.next=null;
	      size--;
		return temp.val;  */
		
		
		
		/*Node cur=front;
		Node temp=back;
		for (int i=0;i<size-2;i++)
		//	T v =cur.v;
		cur=cur.next;
		back=cur;
		back.next=null;
		size--;
		return temp.val;*/
		Node cur=front;
		for (int i=0;i<size-2;i++){
		  cur=cur.next;		
		 }
		T val=back.val;
		back=cur;
		back.next=null;
		size--;
		return val;
		
				
		}
	
	
	
	public boolean contain(String item){
		
	Node cur=front;
	while(cur.next != null){
	cur= cur.next;
		
		if(cur.val.equals(item)){
			return true;	
		 	}
	       }
			return false;
	}
	

    //List Implementation
public void addFirst(T e) {  
  // add to back of the List
          Node n=new Node(e);
          size++;
        if(front==null){
          front=n;
           back=n;
           //back.next=n;    
        }
        else
        {
           n.next=front;
           front=n;
    }            
  }

			/*
			 * 
			 * Stack
			 */

	 //List Implementation
	 public void push(T e) {  
        // add First
                Node n=new Node(e);        
                size++;
              if(front==null){
                front=n;
                 back=n;
                 //back.next=n;    
              }
              else
              {
                 n.next=front;
                 front=n;
          }            
        }


		public T pop(){
			//remove First
			T elm=front.val;
			 front=front.next; 
			 size--;
			 return elm;	  
		}		
			 
	 
		public T  peek(){
			  
			return front.val;  
			}	
	
		/*
		  * 
		  * Queue
		  */
		 private void enqueue(T e){
			 //add to the back
			 Node n=new Node(e);
			   size++;
	              if(front==null){
	                front=n;
	                 back=n;
	                 //back.next=n;    
	              }
	              else{
				 back.next=n;
				 back=n;
	              }
			 		 
		 }
	    
		 private T deue(){
			 // remove from the first
			T value=front.val;
			front =front.next;
			 size--;
			return value;
			
			
			 		 
		 }
		
	
	public static void main(String[] args) {
	
	
		SinglyLinkedList <String> list= new SinglyLinkedList<String>();
		//SinglyLinkedList <String> Queue= new SinglyLinkedList<String>();
		//System.out.println(size()-2);
		list.add("hasanain");
		list.add("Taher");
	    list.add("haj Mohahmad");
	    list.add("alsabonchi");
	    list.add("hasanain");
	    list.printList();
	    System.out.println(list.removeLast());
	    list.printList();
	   
	  
	     
	    
		
	}
	}
	
