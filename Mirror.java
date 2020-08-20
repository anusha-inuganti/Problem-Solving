import java.util.LinkedList;
import java.util.Queue;

public class Mirror {
	Node5 head;
	
	public static void main(String args[]) {
		Mirror m=new Mirror();
		m.head=new Node5(1);
		m.head.left=new Node5(2);
		m.head.right=new Node5(3);
		m.head.left.left=new Node5(4);
		m.head.left.right=new Node5(5);
		m.head.right.left=new Node5(6);
		
		m.head.right.right=new Node5(7);
		mirror(m.head);
		m.traverse(m.head);
		
	}

	 void traverse(Node5 head) {
		Queue<Node5> q =new LinkedList<Node5>();
		q.add(head);
		
		while(!q.isEmpty()) {
			
			head=q.remove();
			if(head.left!=null)
				q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
				System.out.println(head.data+ " ");
		}
	}
	private static Node5 mirror(Node5 node) {
		// TODO Auto-generated method stub
		//Node5 l=null,r=null;
		
		if(node.left==null)
			return node;
		
		if(node.right==null)
			return node;
		//if(node.left!=null)
		Node5 l=mirror(node.left);
		//if(node.right!=null)
			Node5 r=mirror(node.right);
	
		node.left=r;
		node.right=l;
		return node;
		
	}
	
	
	
	
}

class Node5{
	Node5 left;
	Node5 right;
	int data;
	public Node5(int data) {
		super();
		this.data = data;
	}
	
}
