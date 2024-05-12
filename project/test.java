package project;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("First number : ");
		int Firstnumber = scanner.nextInt();

		System.out.printf("Second number : ");
		int Secondnumber = scanner.nextInt();

		System.out.println("Number = " + Math.min(Firstnumber, Secondnumber));
		scanner.close();
	}
}