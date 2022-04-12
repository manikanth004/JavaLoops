package Scanner;

import java.util.Scanner;

public class ScannerAssign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		System.out.println("ENter college name");
		System.out.println("Enter Gender");
		System.out.println("Enter height");
		System.out.println("ENter mobile no");


		
		String name= sc.nextLine();
		String clg= sc.nextLine();
		char gender = sc.next().charAt(0);
		double height = sc.nextDouble();
		long mobile = sc.nextLong();
		

		System.out.println("Name is " + name);
		System.out.println("College " + clg);
		System.out.println("Gender " + gender);
		System.out.println("Height is " + height);
		System.out.println("mobile no " + mobile);

	}

}
