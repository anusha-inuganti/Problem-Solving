import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap {
	
	public static void main(String args[]) {
		
		PriorityQueue<Integer> minheap=new PriorityQueue<>();
		PriorityQueue<Integer> maxheap=new PriorityQueue<>(Comparator.reverseOrder());
		
		Scanner sc=new Scanner(System.in);  
		int n= Integer.parseInt(sc.next());
		while(n-->0){
		   int m=Integer.parseInt(sc.next());
		   if(!minheap.isEmpty()&&minheap.peek()<m)
		   {
			   minheap.add(m);
			   //minheap.so
			   if(minheap.size()-maxheap.size()>1)
					maxheap.add(minheap.poll());
			   
		   }
		   else
		     maxheap.add(m);
		   //maxheap sort
		   if(maxheap.size()-minheap.size()>1){
				minheap.add(maxheap.poll());
		   }
		   
		System.out.println("median"+median(minheap,maxheap));
		
		
	}
		sc.close();
	}

	private static double median(PriorityQueue<Integer> minheap, PriorityQueue<Integer> maxheap) {
		// TODO Auto-generated method stub
		
		
		
		if(minheap.size()>maxheap.size())
		{
			return minheap.peek();
		}
		else if(maxheap.size()>minheap.size()) {
			return maxheap.peek();
			
		}
		else {
			double a=minheap.peek();
			double b=maxheap.peek();
			return (a+b)/2;
		}
	}

}
