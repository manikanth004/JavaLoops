package LoopStatements;

import java.util.Scanner;

public class SumIsEvenPntLowAlp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value");
		int m = sc.nextInt();
		System.out.println("Enter the N value");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = m; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

		if (sum % 2 == 0) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.print(ch+"  ");
			}

		} else {
			for (char odd = 'A'; odd <= 'Z'; odd++) {
				System.out.print(odd+" ");
			}
		}

	}

}
