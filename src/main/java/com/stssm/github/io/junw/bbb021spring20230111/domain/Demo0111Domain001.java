package com.stssm.github.io.junw.bbb021spring20230111.domain;

public class Demo0111Domain001 {
	private int age;
	private String name;
	private String address;

	public Demo0111Domain001() {
	}

	public Demo0111Domain001(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Demo0111Domain001{" +
				       "age=" + age +
				       ", name='" + name + '\'' +
				       ", address='" + address + '\'' +
				       '}';
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
