
public class HeapSort {

	
	public static void main(String args[]) {
		 int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length;
	        BT bt=new BT();
	        for(int i=n/2 -1 ;i>=0;i--)
	        {
	        	bt.heapify(arr,i,n);
	        }
	        
	        for(int i=n-1;i>=0;i--) {
	        	int temp=arr[0];
	        	arr[0]=arr[i];
	        	arr[i]=temp;
	        	bt.heapify(arr,0,i);
	        }
	        
	        for(int i=0;i<n;i++) {
	        	System.out.println(arr[i]);
	        }
	}
}

class BT{
	Node4 head;
	void heapify(int[]arr,int i,int n){
		int g=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[i]) {
			g=l;
		}
		if (r<n && arr[r]>arr[l])
		{
			g=r;
		}
		if(i!=g)
		{
			int t=arr[i];
			arr[i]=arr[g];
			arr[g]=t;
			heapify(arr,g,n);
		}
	}
}
class Node4{
	int data;
	Node4 left;
	Node4 right;
	public Node4(int data) {
		super();
		this.data = data;
	}
	
}
