package Scanner;

import java.util.Scanner;

public class ScannerChar {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  Char value");
		char ch=sc.next().charAt(0);
		System.out.println("the char value is " +ch);

	}

}
