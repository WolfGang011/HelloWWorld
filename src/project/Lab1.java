package project;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name : ");
		String Student = scanner.nextLine();

		System.out.println("Avergate : ");
		int avg = scanner.nextInt();

		System.out.println(Student + " có điểm = " + avg);
		scanner.close();
	}
}
