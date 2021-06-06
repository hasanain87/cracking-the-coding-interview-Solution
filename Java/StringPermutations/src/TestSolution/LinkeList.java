package TestSolution;

import java.util.HashSet;

public class LinkeList<T> {
	
	
	
	private class Node {    //Node class
		T val;
		Node next;
		
			Node(T val){	
			this.val=val;		
			  }
		
		
		}


	// static ISimpleList <T> list;
	
	
	      Node  front;
		private Node back;
		private   int size;
		
	//return the size of the List

	public int size() {
		
		return size;
	}

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

	
	
	void deleteDups() {
		Node node=front;
		// extra space takes O(N)
		HashSet<T> set = new HashSet<T>();
		Node cur=null;
		 while(node!=null){
		//iterate through the linked list, adding each element to a hash table	 
		if(set.contains(node.val)){
			cur.next=node.next;
			size--;
		  }else{
			  set.add(node.val);
		      cur=node;
		  }
			node=node.next;    	 
		 }	
	}

	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkeList <String> list= new LinkeList<String>();
		list.add("hasanain");
		list.add("Taher");
	    list.add("haj Mohahmad");
	    list.add("alsabonchi");
	    list.add("hasanain");
	    list.printList();
	    list.deleteDups();
	    list.printList();
	}

}
