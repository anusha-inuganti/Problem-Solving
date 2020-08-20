
public class BinarySearch {
	
	public static void main(String args[]) {
		int[] a= {1,4,6,8,12,45,78,90};
		iterative(a,0);
		recursive(a,90,0,8);
	}

	private static void recursive(int[] a, int i, int j, int k) {
		if(j>k) {
			System.out.println("not found");
			return;
		}
		// TODO Auto-generated method stub
		
		int mid=(j+k)/2;
		if(a[mid]==i) {
		System.out.println(mid);	
		return;
		}
		
		
		if(a[mid]<i)
		recursive(a,i,mid+1,k);
		else
		recursive(a,i,j,mid-1);
		
	}

	private static void iterative(int[] a, int i) {
		// TODO Auto-generated method stub
		int n=a.length/2;
		int k=0,j=a.length;
		while(j>=0&&k<a.length) {
			//n=n/2;
			if(a[n]==i)
				{ System.out.println(n);
				return;
				}
			if(a[n]>i)
			{	
			//n=n/2;
			j=n-1;
			
			}
			else {
				//n=(int) (1.5*n);
				k=n+1;
			}
			n=(k+j)/2;
		}
		System.out.println("not found");
		return;
	}

}
