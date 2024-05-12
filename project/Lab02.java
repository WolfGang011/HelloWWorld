package project;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {

//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều rộng hình chữ nhật : ");
		int chieurong = scanner.nextInt();

		System.out.println("Nhập chiều dài hình chữ nhật: ");
		int chieudai = scanner.nextInt();

		int chuvi = (chieudai + chieurong) * 2;
		int dientich = chieudai * chieurong;
		int canhmin = Math.min(chieudai, chieurong);

		System.out.println("Chu vi : " + chuvi);
		System.out.println("Dien tich : " + dientich);
		System.out.println("Min : " + canhmin);

		scanner.close();
	}
}
