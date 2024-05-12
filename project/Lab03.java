package project;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập giá trị cạnh lập phương : ");
		int canh = scanner.nextInt();

		double thetich = Math.pow(canh, 3);

		System.out.println("Thể tích : " + thetich);

		scanner.close();
	}
}
