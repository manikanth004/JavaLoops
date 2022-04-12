import java.util.Iterator;
import java.util.Scanner;

public class AlphabatebySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
		System.out.println("Enetr the Value");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum+=digit;
			n/=10;
			
		}
		if(sum>26)
		{
			int a=sum;
			sum=0;
			while(n!=0)
			{
				int digit=n%10;
				sum+=digit;
				n/=10;
			}
		}
		int count=0;
		for(char ch='A';ch<='Z';ch++)
		{
			count++;
			if(count==sum)
			{
				System.out.println(ch);
				break;
			}
			
		}
		System.out.println("Do you want to check again");
		System.out.println("Enter 1 for continue OR 2 for Exit");
		int x=sc.nextInt();
		if(x==1)
		{
			continue;
		}
		else if(x==2)
		{
			break;
		}
		else
		{
			System.out.println("Invalid Input");
			break;
		}
		
		}
		

	}

}
