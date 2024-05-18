package array;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int[] clubs = { 7, 2, 5, 3, 16 };

//		Arrays.sort(clubs);
//		// Hàm Arrays.toString nó trả chuỗi ký tự của mảng
//		System.out.println(Arrays.toString(clubs));

		// Vòng lập for sort theo thứ tự
		for (int i = 0; i < clubs.length; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));
	}
}
