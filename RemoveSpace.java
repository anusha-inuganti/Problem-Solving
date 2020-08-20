import java.util.Scanner;

public class RemoveSpace {
	

	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	sc.nextLine();
	while(T-->0) {
		String s=sc.nextLine();
		
		s=s.replace(" ", "");
		System.out.println(s);
//		String[] s1=s.split("");
//		for(int i=s1.length-1;i>=0;i--) {
//			if(i!=0)
//			System.out.print(s1[i]+".");
//			else
//				System.out.print(s1[i]);
//		}
//		
//		System.out.println();
		
	}
	sc.close();
	}
	
}


