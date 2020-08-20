import java.util.Scanner;

public class Bleak {
	
	public static void main (String[] args)
	 {
	 //code
	 
Scanner sc=new Scanner(System.in);  
int n= Integer.parseInt(sc.next());
while(n-->0){
   int m=Integer.parseInt(sc.next());
   
   String l=Integer.toBinaryString(m);
   
   int p=l.length();
//   for(int i=0;i<l.length();i++) {
//	   if(l.charAt(i)=='1') {
//		   p++;
//	   }
//   }
   
   //System.out.println("p"+p);
   boolean boo=false;
   for(int i=p;i>0;i--)
   {
   String o=Integer.toBinaryString(m-i);
   int k=0;
   for(int j=0;j<o.length();j++) {
	   if(o.charAt(j)=='1') {
		   k++;
	   }
   }
	   if(((m-i)+k)==m)
{
		   boo=true;
	System.out.println("0");
	break;
}
		   
}
   if(!boo)
	   System.out.println("1");
}
sc.close();
	 }
}


