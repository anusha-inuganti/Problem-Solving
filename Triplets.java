
public class Triplets {
	
	public static void main(String args[]) {
		int[] a= {88, 64, 45, 21, 54};	
		
		int count=0;
		
		for(int i=0;i<a.length-2;i++) {
			
			for(int j=i+1;j<a.length-1;j++) {
				if( a[j]>=a[i])
					break;
				for(int k =j+1;k<a.length;k++)
				{
					if(a[k]>=a[j]) 
						break;
					count++;
					
				}
				
			}
			
		}
		
		System.out.println(count);
	}

}
