package chapter4;

public class pjstudent {

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Student");

		pjstudent test = new pjstudent();
		int a = test.sum(6, 9);

		System.out.println("Check sum = " + a);

		// Khai báo 1 object và gán giá trị
//		Student st = new Student();
//		st.name = "Eric";
//		st.age = 25;
//
//		System.out.println("student with name = " + st.name + " and age = " + st.age);

	}
}
