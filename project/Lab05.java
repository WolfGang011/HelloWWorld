package project;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Lựa chọn của bạn là gì :");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("Bạn vừa lựa chọn phép cộng ");
			break;
		case 2:
			System.out.println("Bạn vừa lựa chọn phép trừ ");
			break;
		default:
			System.out.println("Bạn vừa lựa chọn thoát chương trình");
			System.exit(0);
		}

		scanner.close();
	}
}
