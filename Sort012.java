import java.util.Scanner;

public class Sort012 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				}
			
			sort(a);
			
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
		}
		sc.close();
		
	}

	private static void sort(int a[]) {
		// TODO Auto-generated method stub
		int l=0;
		int m=0;
		int h=a.length-1;
		
		while(h>=m) {
			
			if(a[m]==0) {
				swap(m,l,a);
				l++;
				m++;
			}
			else if (a[m]==1) {
				m++;
			}
			else {
				swap(h,m,a);
				h--;
			}
		}
		
	}

	private static void swap(int i, int j,int a[]) {
		// TODO Auto-generated method stub
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
