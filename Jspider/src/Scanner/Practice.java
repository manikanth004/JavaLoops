package Scanner;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------WELCOME TO AMAZON APP----------------");
		System.out.println("========Enter The Details For Registration======");
		System.out.println("Enter The Name");
		String name = sc.next();
		System.out.println("Enter mobile number");
		long mobile = sc.nextLong();
		System.out.println("Enter the Email");
		String email = sc.next();
		System.out.println("Enter the UserName");
		String uname = sc.next();
		System.out.println("Enter the Password");
		String psw = sc.next();
		System.out.println("Enter the Confirm Password");
		String cpsw = sc.next();
		System.out.println("=======>Thankyou For Registration========");
		System.out.println("------------------------------------------");
		System.out.println("Do you want to Continue...!");
		System.out.println("Enter 1 to continue OR 2 for Exit");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("Enter the Username");
			String nuname = sc.next();
			System.out.println("Enter the password");
			String npsw = sc.next();

			if (uname.equals(nuname) && psw.equals(npsw)) {
				System.out.println("====================================");
				System.out.println("            LOGIN SUCESSFUL             ");
				System.out.println("====================================");
				System.out.println("Enter 1 for Shopping");
				System.out.println("Enter 2 for Groceries");
				System.out.println("Enter 3 for Electronics");
				int b = sc.nextInt();
				switch (b) {
				case 1: {
					System.out.println("----------------------------------");
					System.out.println("THANKS FOR CHOSSING SHOPPING");
					System.out.println("Enter 1 for Men's");
					System.out.println("Enter 2 for Women");
					System.out.println("Enter 3 for Kids's");
					int s = sc.nextInt();
					switch (s) {
					case 1:
						System.out.println("Welcome to Mens Section");
						break;
					case 2:
						System.out.println("Welcome to Womens Section");
						break;
					case 3:
						System.out.println("Welcome to Kids Section");
						break;
					default:
						System.out.println("Sorry section is not available");
					}
					break;	}
					
				case 2: {
					System.out.println("Thanks for chossing Groceries");
					System.out.println("ENter 1 for Fruits");
					System.out.println("ENter 2 for Vegatabiles");
					System.out.println("ENter 3 for Diary");
					int g=sc.nextInt();
					switch(g)
					{
					case 1:System.out.println("Welcome to Fruits section");
					System.out.println("select 1 for apple");
					System.out.println("select 1 for Banana");
					System.out.println("select 1 for Manago");
					int f=sc.nextInt();
					switch(f)
					{
					case 1:System.out.println("Apple selected");break;
					case 2:System.out.println("Banana selected");break;
					case 3:System.out.println("Mango selected");break;
					
					}
					break;
					
					case 2:System.out.println("Welcome to Vegatabiles section");
					System.out.println("Welcome to Vegetable section");
					System.out.println("Enter 1 for Tomato");
					System.out.println("Enter 1 for Potato");
					System.out.println("Enter 1 for Lemon");
					int v=sc.nextInt();
					switch(v)
					{
					case 1:System.out.println("Tomato selected");break;
					case 2:System.out.println("Potato selected");break;
					case 3:System.out.println("Lemonselected");break;
					
					
					}
					
					
					
					break;
					case 3:System.out.println("Welcome to Diary section");break;
					}
					break;

				}

				case 3: {
					System.out.println("Thanks for chossing Electronics");
					break;
				}

				default:
					System.out.println("Sorry section is not available");
				}
			} else {

				System.out.println("====================================");
			System.out.println("INCORRECT USERNAME OR PASSWORD");}
			
		} else if (a == 2) {
			System.out.println("Visit again");

		} else
			System.out.println("Invalid inout ..! please choose your input");
	}
}
