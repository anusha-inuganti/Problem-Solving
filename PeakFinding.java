
public class PeakFinding {
	
	public static void main(String args[]) {
		
		int a[]= {100, 80, 60, 50, 20};
			//{10, 20, 15, 2, 23, 90, 67};
			//{5, 10, 20, 15};
			//{8,6,7,10,2,1};
		
		System.out.println(findPeak(a,0,a.length-1,a.length));
		
	}

	private static int findPeak(int[] a, int l, int r,int n) {
		// TODO Auto-generated method stub
		if(l<=r)
		{
			int mid= (l+r)/2;
		
		if( (mid==0 || a[mid]>=a[mid-1])&& (mid==n-1 || a[mid]>=a[mid+1])) {
			return mid;
		}
		
		else if(a[mid]<a[mid-1]) {
		return 	findPeak(a,l,mid,n);
		}
		else {
			return findPeak(a,mid,r,n);

		}
		}
		return -1;
	}

}
