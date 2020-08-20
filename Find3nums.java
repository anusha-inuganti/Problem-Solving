import java.util.Arrays;
import java.util.HashSet;

public class Find3nums {
	
	 public static void main(String[] args) 
	    { 
	        int A[] = { 1, 4, 45, 6, 10, 8 }; 
	        int sum = 22; 
	        int arr_size = A.length; 
	  
	        find3Numbers(A, arr_size, sum); 
	    }

	private static void find3Numbers(int[] a, int arr_size, int sum) {
		// TODO Auto-generated method stub
		
		//Arrays.sort(a);
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<arr_size;i++)
		{
			int sum2=sum-a[i];
			for(int j=i+1;j<arr_size;j++) {
				int sum3=sum2-a[j];
				if(h.contains(sum3)) {
					System.out.println("sum"+a[j]+sum3+a[i]);
				}
				h.add(a[j]);
			}
			
		}
		
		
	} 

}
