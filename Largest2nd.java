import java.util.Scanner;

public class Largest2nd {

	
		
		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			while(T-->0) {
				int n=sc.nextInt();
				int a[] = new int[n];
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
					}
				int x=sort(a);
				System.out.println(x);
				
			}
			sc.close();
		}

		private static int sort(int[] a) {
			// TODO Auto-generated method stub
			int x=0,y=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>y)
					{
					x=y;
					y=a[i];
					}
				else if (a[i]>x) {
					x=a[i];
				}
			}
			
			return x;
		}
}
