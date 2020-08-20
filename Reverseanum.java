
public class Reverseanum {

	public static void main(String agrs[]) {
		
		int n=453;
		
		reverse(n);
	}

	private static void reverse(int n) {
		// TODO Auto-generated method stub
		//int a[]=new int[n];
		//int i=0;
		int n1=0;
		while(n!=0)
		{
			//a[i]=n%10;
			n1=n1*10+n%10;
			n=n/10;
			//i++;
		}
		//int n1=0;
		
//	for(int j=0;j<i;j++) {
//		int p=(i-1-j);
//		int k = (int) Math.pow(10,p);
//			n1=n1+a[j]*k;
//		}
		System.out.println(n1);
	}
}
