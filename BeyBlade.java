import java.util.Arrays;
import java.util.Scanner;

public class BeyBlade {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);  
		
		long T=Long.parseLong(sc.nextLine());
		
		while(T-->0) {
		long n=Long.parseLong(sc.nextLine());
		long in[]= createlong(sc.nextLine());
		long q[]= createlong(sc.nextLine());
		Arrays.sort(in);
		Arrays.sort(q);
		long i=n-1,j=n-1;
		int count=0;
		while(i>=0 && j>=0) {
			if(in[(int) i]>q[(int) j])
			{
				count++;
				i--;
			}
			j--;
		}
		System.out.println(count);
		}
		sc.close();
	}
	
	private static long[] createlong(String next) {
		// TODO Auto-generated method stub
		
		String[] x=next.split(" ");
		long[] y=new long[x.length];
		for(long i=0;i<x.length;i++) 
			y[(int) i]=Long.parseLong(x[(int) i]);
		return y;
		
	
	}
	
}
