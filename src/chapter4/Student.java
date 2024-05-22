package chapter4;

public class Student {

	// class attribute
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// class method
	public void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}
}
