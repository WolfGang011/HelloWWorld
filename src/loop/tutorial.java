package loop;

public class tutorial {
	public static void main(String[] args) {

		// vòng lập for
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("---------------------");

		// Vòng lập while (Kiểm tra điều kiện đúng mới chạy)
		int i = 1;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("---------------------");

		// Vòng lập do - while (Nó thưc hiện trước khi check điều kiện)
		int k = 5;
		do {
			System.out.println(k);
			k++;
		} while (k < 5);

		System.out.println("---------------------");

		// break/Continue
		for (int j = 0; j < 5; j++) {
			if (j == 4) {
				break;
			}
			System.out.println(j);
		}

		System.out.println("---------------------");

		for (int t = 0; t < 6; t++) {
			if (t > 1) {
				continue;
			}
			System.out.println(t);
		}
	}
}
