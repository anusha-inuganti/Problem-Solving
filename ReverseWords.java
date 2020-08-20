import java.util.Scanner;

public class ReverseWords {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			String s=sc.next();
			String[] s1=s.split("\\.\\s*");
			System.out.println();
			for(int i=s1.length-1;i>=0;i--) {
				if(i!=0)
				System.out.print(s1[i]+".");
				else
					System.out.print(s1[i]);
			}
			
			//System.out.println();
		}
		sc.close();
		
	}


}
