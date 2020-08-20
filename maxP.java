import java.util.*;
import java.lang.*;
import java.io.*;
class maxP
 {
	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner sc=new Scanner(System.in);  
		
		int  T=Integer.parseInt(sc.nextLine());
		
		while(T-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		  int tot=1,cur=1;
		int max=1;
		 for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			tot=tot*a[i];
				if(a[i]>0)
				cur=cur*a[i];
				else
					cur=1;
			if(cur>max)
				max=cur;
			if(tot>max)
				max=tot;
			
			if(a[i]==0)
				tot=1;
			
		}
			System.out.println(max);
		}
		

		}
	 
}