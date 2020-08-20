import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Also has Max Depth

public class BFS {
	Node1 head;
	 int maxdepth;
	static class  Node1{
		Node1 left;
		Node1 right;
		int data;
		public Node1(int data) {
			super();
			this.data = data;
			left=right=null;
		}
		
		
		
	}
	
	 void depth(Node1 node, int level) {
		if(node.left!=null)
			depth(node.left,level+1);
		if(node.right!=null)
			depth(node.right,level+1);
		if (level>maxdepth)
			maxdepth=level;
		
		
	}
	
	void inorder(Node1 node) {
		
		if(node==null)
			return;
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
	}
	void traverse() {
		Queue<Node1> q =new LinkedList<Node1>();
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
	
	
	public static void main(String args[]) {
		BFS tree_level=new BFS();
		tree_level.head = new Node1(1); 
        tree_level.head.left = new Node1(2); 
        tree_level.head.right = new Node1(3); 
        tree_level.head.left.left = new Node1(4); 
        tree_level.head.left.right = new Node1(5); 
        tree_level.head.right.left=new Node1(6);
        tree_level.head.right.left.right=new Node1(7);
        
  
        //System.out.println("Level order traversal of binary tree is - "); 
        //tree_level.traverse(); 
        //tree_level.inorder(tree_level.head);
		
        tree_level.depth(tree_level.head,1);
        System.out.println("maxdepth"+tree_level.maxdepth);
        int maxsum=tree_level.head.data;
        int[] sum=new int[tree_level.maxdepth+1];
        
        tree_level.maxsum(tree_level.head,sum,0);
        for(int i=0;i<sum.length;i++) {
        	//System.out.println(sum[i]);
        	maxsum=Math.max(maxsum, sum[i]);
        }
        System.out.println(maxsum);
        
		
	}

	private  void maxsum(Node1 head, int[] sum, int maxdepth) {
		// TODO Auto-generated method stub
		sum[maxdepth]=sum[maxdepth]+head.data;
		if(head.left!=null) 
			maxsum(head.left,sum,maxdepth+1);
			if(head.right!=null) 
				maxsum(head.right,sum,maxdepth+1);
		}
	
}
