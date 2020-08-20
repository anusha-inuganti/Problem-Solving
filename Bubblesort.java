import java.util.Scanner;

public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int x=sc.nextInt();
//			int n=sc.nextInt();
//			int m=sc.nextInt();
//			int g=gcd(n,m);
//			System.out.println(g);
			int arr[]=new int[x];
			for(int i=0;i<x;i++) {
				arr[i]=sc.nextInt();
			}
			int g=findGcd(arr);
			System.out.println(g);
		}
}

private static int findGcd(int[] arr) {
	// TODO Auto-generated method stub
	int result=arr[0];
	for(int i=1;i<arr.length;i++) {
		result=gcd(arr[i],result);
		if(result==1)
			return 1;
	}
	return result;
}

static void bubble(int a[], int k, int n)
{
   // add your code here
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n-i-1;j++)
       {
           if(a[j]>a[j+1])
           {
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
               
           }
       }
   }
}


private static int gcd(int a, int b) {
	if(a==0)
		return b;
	return gcd(b%a,a);
}

private static int gcd2(int a, int b) {
	if(a==0)
		return b;
	if(b==0)
		return a;
	if(a==b)
		return a;
	
	if(a>b)
		return gcd(a-b,b);
	// TODO Auto-generated method stub
	return gcd(a,b-a);
}


}
