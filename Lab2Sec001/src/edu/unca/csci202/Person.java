package edu.unca.csci202;

public class Person {

	private String name;
	private int age;
	private String address;
	private String gender;

	public Person(String name,int age, String address,String gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return name + " (age " + age + ") " + "is gender " + gender + " with address: " + address;
	}





}
