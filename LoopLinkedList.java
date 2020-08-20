
public class LoopLinkedList {
	 int val;
	    LoopLinkedList next;
	    LoopLinkedList() {}
	    LoopLinkedList(int val) { this.val = val; }
	    LoopLinkedList(int val, LoopLinkedList next) { this.val = val; this.next = next; }
	  
	

	
	 public LoopLinkedList middleNode(LoopLinkedList head) {
		 LoopLinkedList node=head;
		 LoopLinkedList i=node;
		 LoopLinkedList j=node;
	        while(j!=null && j.next!=null){
	            i=i.next;
	            j=j.next.next;
	            
	        }  
	        return i;
	 }
	 
	 public static LoopLinkedList findLoop(LoopLinkedList head) {
		 LoopLinkedList i=head;
		 LoopLinkedList j=head;
	        while(j!=null && j.next!=null){
	            i=i.next;
	            j=j.next.next;
	            if(i.next==j.next) {
	            	break;
	            }
	            
	        }  
	        return i;
		 
		 
	 }
	        
	  public static void main(String args[]) {
		  LoopLinkedList l=new LoopLinkedList(1);
		  l.next=new LoopLinkedList(2);
		  l.next.next=new LoopLinkedList(3);
		  l.next.next.next=new LoopLinkedList(4);
		  l.next.next.next.next=l.next.next;
		  LoopLinkedList l1=findLoop(l);
		  System.out.println(l1.val);
		  
	  }
	        	   

}
