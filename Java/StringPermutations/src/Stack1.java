
public class Stack1 <T> {
	 public  Node head;
	   int size;
	   
	   
	   private class Node {    //  Private inner Node class
			T val;
	      Node next;
	      
	     
		}
	   
	
		
		//return the size of the List
		
		public int size() {
			
			return size;
		}


		public void  push(T e) {  // add to back of the List
			// TODO Auto-generated method stub
			
			Node  newNode =new Node(); //create newNode
	      newNode.val=e;
	      newNode.next=head;
	      head = newNode;
	      size++;
			   
	     
			   
			
		}


		// Remove the item at position index and return the item that was just removed

	   public  T popa() {
			
		   Node temp = head;
		     
	         head = head.next;
	         size--;
	         
	         return temp.val;
	             
	}
	  // }     
	   
	   public static boolean isMatched(String expression) {
		   
		   
			final String opening = "({[";
		   final String closing = ")}]";
		      
		   Stack1 <Character> stack1 =new Stack1<>  ();
		      
		      for (char c : expression.toCharArray( )) {
		    	 
		    	 int x= opening.indexOf(c);
		         if (x!= -1){
		            
		        	 stack1.push(c);
		         }
		         else if (closing.indexOf(c) != -1 ) {
		            if (stack1.isEmpty())
		               return false;
		            if (closing.indexOf(c) == opening.indexOf(stack1.popa( )))
		               return true;
		         }
		      }
		      return stack1.isEmpty();
		   }
		
	  
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size==0)
		return true;
		
		else
			return false;
	}


	public static void main(String[] args) {
	      
	    Stack1 <String> stacka =new Stack1<String>  ();
	       
	       stacka.push("It");
	       stacka.push("Was");
	      int x= stacka.size();
	     System.out.println(x);
	       stacka.popa();
	       boolean b=isMatched("(( )(( )){([( )])}");
	    System.out.println(b);
	     
	      //stack1.printList();
	      // System.out.println(stacka.isEmpty());
	     //System.out.println(item);
	   }
	   
	
	
	
	
}
