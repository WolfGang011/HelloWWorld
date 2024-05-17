package Lab02;

import java.util.Scanner;

public class Lab04 {

	public static void bai01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập giá trị a : ");
		int a = scanner.nextInt();
		System.out.println("Nhập giá trị b : ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}

		scanner.close();
	}

	public static void bai02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập giá trị a : ");
		int a = scanner.nextInt();
		System.out.println("Nhập giá trị b : ");
		int b = scanner.nextInt();
		System.out.println("Nhập giá trị c : ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc 2 %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			// giải phương trình bậc nhất
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình vô nghiệm x = %3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta) / (2 * a));
				double x2 = (-b - Math.sqrt(delta) / (2 * a));
				System.out.printf("Phương trình có 2 nghiệm riêng biệt x1=%.3f, x2 = %.3f", x1, x2);
			}
		}

		scanner.close();
	}

	public static void bai03() {
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.print("Lựa chọn của bạn : ");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println("Kết thúc");
			System.exit(0);
		}

		scanner.close();
	}
}
