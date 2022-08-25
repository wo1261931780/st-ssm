package com.stssm.github.io.domain;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.domain
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-28  星期日
 * @description
 */
public class Account {
	private int age;
	private String name;
	private String address;

	@Override
	public String toString() {
		return "Account{" +
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