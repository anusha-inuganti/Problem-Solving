import java.util.*;


//Standard Chartered screening test.
//3
//1 100 TN
//101 200 KL
//201 300 KA
//150 - get the pin code
//KL
class Main
{
    public static void main (String[] args)
    {
        // Code your solution here
    	Scanner sc=new Scanner(System.in);  
		
		int T=Integer.parseInt(sc.nextLine());
		String s[]=new String[T];
		for(int i=0;i<T;i++) {
			s[i]=sc.nextLine();
		}
		int n=sc.nextInt();
		for(int i=0;i<T;i++) {
			String s1[]=s[i].split(" ");
			int w=Integer.parseInt(s1[1]);
			if(w>=n)
				{System.out.println(s1[2]);
				break;
				}
		}
		
    sc.close();
    }
}