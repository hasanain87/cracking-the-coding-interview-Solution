package TestSolution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PQ {
	
	public static void sortUsingPQ(List<Integer> list)
	{
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<list.size();i++){
			pq.add(list.get(i));
			
		}
		
		 /*pq.add(66);
		 pq.add(5);
         pq.add(99);
         pq.add(70);
         pq.add(75);
         pq.add(90);*/
         
         
      //
         System.out.print(pq);
         System.out.println("Head of PQ   "+pq.poll());
         System.out.println("Head of PQ   "+pq.poll());
         
	 }
		

	 
	
	
	 public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 list.add(3);
		 list.add(5);
		 list.add(99);
		 list.add(100);
		 list.add(1010);
		 list.add(10);
		 sortUsingPQ(list);
		
         
	 }
}
