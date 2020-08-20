
public class MaxProduct {

	
	public static void main(String args[]) {
		
		int a[]= {-8, 5, 3, 1, 6};
		int tot=1,cur=1;
		int max=1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			tot=tot*a[i];
				if(a[i]>0)
					{
						cur=cur*a[i];
					
					}
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
