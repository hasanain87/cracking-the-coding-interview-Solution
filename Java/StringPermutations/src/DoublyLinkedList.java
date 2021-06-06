

public class DoublyLinkedList <T>{
			
			 class Node{
			
			T value;
			Node next;
			Node previous;
			}
			
	 public Node head;
	private Node back;
	private int size;
	
	
	void add(T val){		 
		if(head==null){	
			Node n= new Node();
			n.value=val;
			size++;
			head=n;
            back=n;
		
		
		}
		
		 else
	      {
			    
				Node n= new Node();
			    n.value=val;
				size++;
				//connect  the previous to n       previous<------N    
			    head.previous=n;
			    //Next <---------   head , the address for the Node just before it.
			    
			     n.next=head;
			    // Move the Head to new Node  N
			    head=n;

	      }
}

	 void addAter(T val)
	 {
		
	 Node n= new Node();
	 
	 
	 
	 if(head==null){	
		 n.value=val;
		 size++;
			head=n;
            back=n;
	 }
            else{
            	n.value=val;
           	    size++;
			     head.next=n;
				 n.previous=head;
				 back=n;
            }
		 
		 
	  }

	 
	 
	 void addAterN(Node node,T val)
	 {
		
	 Node n= new Node();
	 
	 
	 
	 if(head==null){	
		 n.value=val;
		 size++;
			head=n;
            back=n;
	 }
            else{
			    Node cur=head;
			    while(cur.next !=null){
			    	
					    if(cur.value.equals(node)){
					    	
					    	cur.next=n;
					    	n.previous=cur;
					    	
					    
					    }
			         }  
                  }
		 
		 
	  }
	 
	 
	 
	public void printList() {
	
		StringBuilder  result= new StringBuilder ("[");   // String Array that contains [ and element 
		Node cur=head;
		
		while ( cur !=null){
			for(int i=0;i<size;i++){
				result.append(cur.value);
				cur =cur.next;
				if(cur !=null){
					result.append(",");
				}
				else result.append("]");
				
			}
		}
		System.out.println(result);
		
			
		}
		
	
	
	
	
	public static void main(String[] args) {
		
	DoublyLinkedList <String> list= new  DoublyLinkedList <String>();
	list.addAter("Hasanain");
	list.addAter("haj Muhamed");
	list.addAter("taher");
     
	//list.addAterN(head,"kassim");
	//list.add("Kassim");
	
	//list.add("Kassim");
	list.printList();
	}
	
	
}