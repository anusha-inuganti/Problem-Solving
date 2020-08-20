
public class Quicksort {

	

	
	public static void main(String args[]) {
		 int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length;
		Quicksort q=new Quicksort();
		q.sort(arr,0,n-1);
		 for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
		
	}
	private void sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) {
		int pi=arrange(arr,i,j);
		
		sort(arr,i,pi-1);
		sort(arr,pi+1,j);
		}
	}
	private int arrange(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pi=arr[high];
		int i=low-1,j=low;
		
		for(j=low;j<high;j++) {
			if(arr[j]<pi) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
			
		}
		arr[high]=arr[i+1];
		arr[i+1]=pi;
		
		return i+1;
	}
	
}
