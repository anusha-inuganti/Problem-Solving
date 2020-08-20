
public class SieveofEratosthenes {
	
	public static void main(String args[]) {
		int n=50;
		
		int primes[]=new  int[n+1];
		primes[0]=0;
		primes[1]=0;
		for(int i=2;i<=n;i++) {
			primes[i]=0;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(primes[i]!=1)
				for(int j=i*2;i*j<=n;j++) {
					//if(j%i==0)
					primes[i*j]=1;
				}
		}
		
		for(int i=0;i<=n;i++)
			if(primes[i]==0)
				System.out.println(i);
	
	
	int l=15,r=50;
	int m=r-l;
	int prime[]= new int[m+1];
	
	for(int i=0;i<m;i++) {
		prime[i]=0;
	}
	
	for(int i=l;i<r;i++)
	{
		if(prime[i]!=1)
			for(int j=i;i*j<m;j++)
				//if(j%i==0)
					prime[i*j]=1;
	}
	int count=0;
	for(int i=0;i<=n;i++)
		if(primes[i]==0)
			count++;
	System.out.println(count);
}
}
