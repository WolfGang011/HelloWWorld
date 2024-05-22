package chapter4;

public class Video28 {
	public static void main(String[] args) {

		Student st1 = new Student();

		Student st2 = new Student("Eric", 26);
		st2.setName("Update code");
		System.out.println("Check obj: " + st2.getName() + " and age = " + st2.getAge());
	}
}
