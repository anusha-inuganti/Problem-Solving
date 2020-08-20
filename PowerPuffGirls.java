import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class PowerPuffGirls {

	
	//private static final long MAX_VALUE = 0x7fffffffffffffffL;

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);  
		long n=Long.parseLong(sc.nextLine());
		long in[]= createlong(sc.nextLine());
		long q[]= createlong(sc.nextLine());
		
		//long min=q[0]/in[0];
		long min=0x7fffffffffffffffL;
		for(long i=0;i<n;i++) {
			if(q[(int) i]== 0|| in[(int) i]==0)
			{
				if(in[(int) i]!=0 && q[(int) i]==0)
			{
				min=0;
				break;
			}
			}
				else if(q[(int) i]!=0 && in[(int) i] !=0) {	
			
			if((q[(int) i]/in[(int) i])<min)
				min=q[(int) i]/in[(int) i];
				}
		
		}
		System.out.println(min);
		sc.close();
	}
		
//		long[] in=new long[(int) n];
//				for(long i=0;i<n;i++) {
//					in[(int) i]=sc.nextInt();
//				}
//				
//				long min= 0x7fffffffffffffffL;
//				long p=0;
//				long q=0;
//				for(long i=0;i<n;i++) {
//					p=sc.nextInt();
//					if(p!=0 && in[(int) i]!=0)
//					{
//						q=p/in[(int) i];
//					 if(q<min)
//						min=q;
//					}
//					else if(p==0 && in[(int) i]!=0) {
//						min=0;
//						break;
//					}
//					
//				}
	
			
 	

	private static long[] createlong(String next) {
		// TODO Auto-generated method stub
		
		String[] x=next.split(" ");
		long[] y=new long[x.length];
		for(long i=0;i<x.length;i++) 
			y[(int) i]=Long.parseLong(x[(int) i]);
		return y;
		
	
	}
}
