package de.telrun.khakov.rustam.lesson5;

/**
 * @author Rustam Khakov
 */
public class Student {
	private int age;
	private String name;

	public Student() {

	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName(){
		return name;
	}

}
