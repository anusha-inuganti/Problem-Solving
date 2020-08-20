
public class Fibonacci {
public static void main(String agrs[]) {
		
		int n=23;
		
		System.out.println(fibonacci_rec(n));
		System.out.println(fibonacci_it(n));
	}

private static int  fibonacci_rec(int n) {
	// TODO Auto-generated method stub
	if(n==1)
		return 1;
	if(n<1)
		return 0;
	return fibonacci_rec(n-1)+fibonacci_rec(n-2);
}

private static int  fibonacci_it(int n) {
	// TODO Auto-generated method stub
	int a=1,b=1,c;
	if(n==0)
		return 0;
	for(int i=2;i<n;i++) {
		c=a+b;
		a=b;
		b=c;
		
	}
	return b;
}


}
