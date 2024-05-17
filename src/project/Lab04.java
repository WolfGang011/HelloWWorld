package project;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số tiền thuế : ");
		int thue = scanner.nextInt();
		if (thue < 10) {
			System.out.println("Không đóng thuế");
		} else if (10 <= thue && thue <= 15) {
			System.out.println("Thuế 10%");
		} else if (15 <= thue && thue <= 30) {
			System.out.println("Thuế 20%");
		} else {
			System.out.println("Thuế 50%");
		}

		scanner.close();
	}
}
