package LoopStatements;

public class ForMNSumProd {

	public static void main(String[] args) {
		int m=1;
		int n=3;
		int sum=0;
		int prod=1;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
			prod*=i;
			
		}
		if(sum==prod)
		{
			if(sum%2==0)
			{
				System.out.println("sum even");
				
			}
			else
			{
				System.out.println("sum odd");
			}
		}
		else 
		{
			if(prod%2==0)
			{
				System.out.println("prod even");
			}
			else
			{
				System.out.println("prod odd");
			}
		}


	}

}
