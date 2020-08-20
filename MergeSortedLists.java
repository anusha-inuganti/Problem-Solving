
public class MergeSortedLists {
	public static void main(String args[]) {
		SortedLists llist1 = new SortedLists(); 
		SortedLists llist2 = new SortedLists(); 
		SortedLists llist3 = new SortedLists(); 
		      
		    // Node head1 = new Node(5); 
		    llist1.addToTheLast(new Node3(1)); 
		    llist1.addToTheLast(new Node3(3)); 
		    llist1.addToTheLast(new Node3(5));
		    llist1.addToTheLast(new Node3(7));
		      
		    // Node head2 = new Node(2); 
		    llist2.addToTheLast(new Node3(2)); 
		    llist2.addToTheLast(new Node3(4)); 
		    llist2.addToTheLast(new Node3(6)); 
		    llist2.addToTheLast(new Node3(8)); 
		    
		    llist3.addToTheLast(new Node3(0)); 
		    llist3.addToTheLast(new Node3(9)); 
		    llist3.addToTheLast(new Node3(10));
		    llist3.addToTheLast(new Node3(11));
		    
		    //uncomment to test merge 2 sorted lists
		    
//		    llist1.head=llist1.sort(llist1.head, llist2.head);
//		    llist1.printList();
		    
		    int k = 3; // Number of linked lists  
	        int n = 4; // Number of elements in each list  
	    
	        // an array of pointers storing the head nodes  
	        // of the linked lists  
	        SortedLists arr[]=new SortedLists[k];  
	    
	        arr[0] = llist1;
	        arr[1]=llist2;
	        arr[2]=llist3;
	        
	       
	        
	        llist2.head=llist2.mergeKLists(arr,k);
	        llist2.printList();
		    
	}

	
	

}

class SortedLists{
	Node3 head;
	
	
	  Node3 mergeKLists(SortedLists[] arr, int k) {
		// TODO Auto-generated method stub
		//int i=0,j=k;
		Node3 node=arr[0].head;
		for(int i=1;i<k;i++) {
			node=sort(node,arr[i].head);
			
		}
		return node;
	}
	public void addToTheLast(Node3 node)  
	{ 
	    if (head == null) 
	    { 
	        head = node; 
	    } 
	    else 
	    { 
	        Node3 temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    }
	}
	    
	
	void printList() 
	{ 
	    Node3 temp = head; 
	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	    System.out.println(); 
	} 
	
	Node3 sort(Node3 h1,Node3 h2) {
		if(h1==null) {
			return h2;
		}
		if (h2==null) {
			return h1;
		}
		if(h1.data<h2.data) {
			h1.next=sort(h1.next,h2);
			return h1;
		}
		
		else {
			h2.next=sort(h1,h2.next);
			return h2;
		}
	}
	
	
	
}

class Node3{
	Node3 next;
	int data;
	public Node3(int data) {
		super();
		this.data = data;
	}
	
}