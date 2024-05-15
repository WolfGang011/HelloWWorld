package Lab02;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập vào số điện : ");
		int a = scanner.nextInt();

		if (a <= 100) {
			int money = a * 1000;
			System.out.println("Số tiền điện = " + money);
		} else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Sô tiền điện = " + money);
		}

		scanner.close();
	}
}
