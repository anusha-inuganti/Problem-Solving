import java.util.Scanner;

public class Numpownum {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			double lo=Math.log(m)/Math.log(n);
			int mo =(int) (Math.log(m)/Math.log(n));
			
			if(lo==mo) 
				System.out.println("1");
				else
					System.out.println("0");
			
		}
		sc.close();
	}
	
}
