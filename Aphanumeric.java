import java.util.Scanner;

public class Aphanumeric {
	
	public static void main(String args[]) {
		
		
		
		
		
Scanner sc=new Scanner(System.in);  
		
		int  T=Integer.parseInt(sc.nextLine());
		
		while(T-->0){
		    String s=sc.nextLine();
		//s.replaceFirst(regex, replacement)
		int sum=0;
		    String temp = "0"; 
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i)))
				temp+=s.charAt(i);
			
			else
				{
				sum+=Integer.parseInt(temp);
				temp="0";
				}
		}
			System.out.println(sum+Integer.parseInt(temp));
			
		}
		sc.close();
	
		
//		String s="1A1B2CDE";
//		//s.replaceFirst(regex, replacement)
//		int sum=0;
//		String temp = ""; 
//		for(int i=0;i<s.length();i++) {
//			if(Character.isDigit(s.charAt(i)))
//				temp+=s.charAt(i);
//			
//			else
//				{
//				sum+=Integer.parseInt(temp);
//				temp="0";
//				}
//		}
//		System.out.println(sum);
	}
	
	void usingregex(String s){
		
		
		
	}

}
	

//Calculate sum of all numbers present in a string