package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
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
}
