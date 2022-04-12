import java.util.Scanner;

public class SpyRNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SPY value");
		int spy=sc.nextInt();
		int sum=0;
		int prod=1;
		while(spy!=0)
		{
			int digit=spy%10;
			sum+=digit;
			prod*=digit;
			spy/=10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum==prod)
		{
			System.out.println("is SPY Number");
		}
		else
			
		{
			System.out.println("not spy");
		}
	}

}
