
public class BalancedSubstring {

	public static void main(String args[]) {
		
		String s="lrlrlrlr";
		
		int l=0,r=0;
		int i=0,count=0;
		
		while(i<s.length()) {
			if(s.charAt(i)=='l')
				l++;
			else
				r++;
			if(l==r)
				count++;
		}
		
		System.out.println(count);
		
	}
	
	
//	public static void main(String args[]) {
//		//String s="rrlrlrlrlrlrlr";
//		String s ="rrlrl";
//		int lc=0,rc=0,lo=0,ro=0;
//		int count=0,mcount=0;
//		
//		for(int i=0;i<s.length()-1;i++) {
//			
//				
//			if(s.charAt(i)=='l')
//			{
//				lc++;
//				lo++;
//			}
//			if(s.charAt(i)=='r')
//			{
//				rc++;
//				ro++;
//			}
//			if((lc==rc&&lo!=ro)||(i==s.length()-1 && lc==rc))
//			{
//				for(int j=count;j>0;j--)
//					mcount=mcount+j;
//				lo=1;
//				ro=1;
//				count=0;
//			}
//			if(lc==rc) {
//				count++;
//				lc=0;rc=0;
//			}
//			
//			
//			
//			if(lc==2)
//				lc=1;
//			if(rc==2)
//				rc=1;
//			
//		
//		
//	}
//		System.out.println(mcount+count);
//	}
//	
}
