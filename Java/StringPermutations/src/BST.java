	public class BST  {
		
		
	//the starting node of our tree,	
	private static  Node root;	
	
	private  class Node{
		//2 pointer
		int val;
		Node left;
		Node right;	
				
			Node(int val) {
				this.val=val;
			}
				
	 }
	
	Node Ins(Node current,int val){
		
		
		 // the tree is empty , no root node constructed  yet
			if(current== null) 
				  return new Node(val);
			 // call the function  on the  left ref
			else if  (val < current.val)
				
				// keep calling the Ins function until it hit null, whenever it hit null create a new node and reference it to current.left
				// in other words moving the pointer to the next left
				current.left=Ins(current.left, val);
			
			// if the val greater than
			else if (val > current.val) {
			    current.right= Ins(current.right, val);
			}			
				else {
			        // value already exists
			        return current;
			    }
			 
		return current;
	}
		
	
	
		
	
	 Node Insert(Node current,int val){
		
	  
		if(root ==null){
			root=new Node(val);
		}
		 
		// reached null reference
		if(current== null) 
			  return new Node(val);
		
		// if the val less than          
		else if  (val < current.val)   return Ins(current.left, val);
		
		else if (val > current.val) {
		    return Ins(current.right, val);
		}			
			else {
		        // value already exists
		        return current;
		    }
		
	}
	
// O (lg n) stack frame is ~(log n)
	boolean find(Node node, int key){
		
			if(node==null) return  false;
			else if(node.val==key) return true;
			else if(node.val> key)  return find(node.left,key);
			else if (node.val< key)  return  find(node.right,key);
	
			 return false;
	}
	
	
	
	
	 //O (lg n) stack frame is ~(log n)
		Node findNode(Node node, int key){
				
				if(node==null) return  node;
				else if(node.val==key) return node;
				else if(node.val> key)  return   node.left= findNode(node.left,key);
				else if (node.val< key)  return  node.right=findNode(node.right,key);
		
				 return node;
		}
	
	
		// return the refrence of the node
		 Node findNodeByRef(Node node, int key){
				
				if(node==null) return  node;
				else if(node.val==key) return node;
				else if(node.val> key)  return   node.left= findNode(node.left,key);
				else if (node.val< key)  return  node.right=findNode(node.right,key);
		
				 return node;
		}
   
		
		
	
	//O(log n)
	public int getmax(Node curr){
		
	
		Node max=root;
		if(curr.right==null) 
			return  curr.val;
		
		while(curr!=null){
			
			 max=curr;
			 	
			curr=curr.right;		
			
		}
	
		return max.val;
		
	}
	
	
	
	public int getmin(Node curr){
		
		
		if(curr.left == null) return curr.val;
		else
		
		return 
			    getmin(curr.left);
		
		
		
	}
	
	
	public Node  delete(Node node,int value) {
	   
		if(node==null) return null;
				
			
			 if(node.val>value ) 
				  node.left=delete(node.left,value);
			
			  else if( node.val < value) 
				// 
				  node.right=delete(node.right,value);	
			
			else{ 
				// case 1 if the node is leaf  which is the right and  left equals to null;
			       if(node.right == null && node.left== null){
			    	   node = null;
			       }
			    	  
			       // work
			       else if( node.left != null&&node.right!= null ){
			    	   
			    	   //Node temp=root;
			    	   //
			    	   int minVAl=getmin(root.right); 
			    	   // if you send node.right wont work;
			    	   delete(root,minVAl);
			    	   node.val=minVAl;   	   
			       }
			    	 
			     else if( node.left == null&& node.right!= null ){
			    	    
			    	 return node.right;
			    	   //delete(node,node.val);
			       	   
			       } 
	                else if( node.right == null&& node.left != null){
			    	    
	   		    	return node.left;
	   		    	   //delete(node,node.val);   	   
	   		         }
			        
				   }
			 		    
				return node;	
	  }
	
	
	
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 
	
		/* then print the data of node */
		System.out.print(node.val + "  "); 
		
		/* first recur on left child */
		printInorder(node.left); 
	
	
		/* now recur on right child */
		printInorder(node.right); 
	} 
	
	
	public int removeMin( ) {
		Node curr=null; 
		Node node=root;
		int x;
		
		while(node.left!=null){
			curr=node;
			node=node.left;

			
		}
	
		x=node.val;
		 curr.left=curr.right;
		 curr.right=null;
		return x;	
	}
	
	
	//Solution to the Test2 
	// Write a recursive function that takes a node  as a parameter and  returns the tree size for the BST
	static int count=0;
	public static int TreeSize(Node node){
		if(node==null) return count;
		
		 count++;
		/* then print the data of node */
		System.out.print(node.val + "  "); 
		
		/* first recur on left child */
	   if (node.left!=null){ 
		   count++;
		    return TreeSize(node.left); 
	   }   
		    	
		/* now recur on right child */
		return TreeSize(node.right); 	
	}
	
			
	public static void main(String[] args) {
		BST bst=new BST();	
		
		
		int[] keys = { 15, 10, 20, 8, 12, 16, 25};
	
		
		int[] keys2 = { 1, 2, 3, 4, 5, 6};
		
		for (int key: keys) {
			root=bst.Ins(root, key);
		}
	
		
	
		//bst.printInorder(root );
		//System.out.println("find element    "+bst.find(root,8));
		
		//bst.delete(root,8);
		//System.out.println("--->");
		//System.out.println("Remove Min"+bst.removeMin( ));
		//bst.printInorder(root );
	   // System.out.println(bst.find(root,66));
		//System.out.println("max"+bst.getmax(root));
		//System.out.println("MIn is"+bst.getmin(root));
		System.out.println("=====");
		System.out.println("Size of the Tree is  "+TreeSize(bst.findNodeByRef(root,15) ));
		
			
	}
	
	
	
	
	}