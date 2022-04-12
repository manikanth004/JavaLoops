package LoopStatements;

import java.util.Scanner;

public class ForSumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the M value");
		int m = sc.nextInt();
		System.out.println("Enter the N value");
		int n = sc.nextInt();
		int sum = 0;
		int prod = 1;
		;
		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				prod *= i;
			}
		}
		System.out.println(sum);
		System.out.println(prod);

	}

}
