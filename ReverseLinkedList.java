
public class ReverseLinkedList {

static Node head;


static class  Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		//this.next = next;
	}
	
	
	
}
void printList(Node node) 
{ 
    while (node != null) { 
        System.out.print(node.data + " "); 
        node = node.next; 
    } 
} 


public static void main(String args[]) {
	
	ReverseLinkedList list = new ReverseLinkedList(); 
     list.head = new Node(85); 
     list.head.next = new Node(15); 
     list.head.next.next = new Node(4); 
     list.head.next.next.next = new Node(20); 

     System.out.println("Given Linked list"); 
     list.printList(head); 
     head = list.reverse(head); 
     System.out.println(""); 
     System.out.println("Reversed linked list "); 
     list.printList(head); 
	
}


private Node reverse(Node node) {
	// TODO Auto-generated method stub
	
	Node prev=null;
	Node cur =node;
	Node next=null;
	
	while(cur!=null) {
		next=cur.next;
		cur.next=prev;
		prev=cur;
		cur=next;
		
	}
	node=prev;
	return node;
}

}