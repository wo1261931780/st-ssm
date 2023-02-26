package com.stssm.github.io.junw.bbb016spring20230104.domain;

import java.util.Arrays;
/**
 * @author junw
 */
public class Demo0104DomainUser {

	private String name;
	private int age;
	private Demo0104DomainAddress demo0104DomainAddress;
	// 这里添加完成以后，
	// 需要手动进行get和set操作

	private String[] habits;

	public String[] getHabits() {
		return habits;
	}

	public void setHabits(String[] habits) {
		this.habits = habits;
	}

	public Demo0104DomainUser() {
	}

	public Demo0104DomainAddress getDemo0104DomainAddress() {
		return demo0104DomainAddress;
	}

	public void setDemo0104DomainAddress(Demo0104DomainAddress demo0104DomainAddress) {
		this.demo0104DomainAddress = demo0104DomainAddress;
	}

	public Demo0104DomainUser(String name, int age, Demo0104DomainAddress demo0104DomainAddress, String[] habits) {
		this.name = name;
		this.age = age;
		this.demo0104DomainAddress = demo0104DomainAddress;
		this.habits = habits;
	}

	@Override
	public String toString() {
		return "Demo0104DomainUser{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", demo0104DomainAddress=" + demo0104DomainAddress +
				       ", habits=" + Arrays.toString(habits) +
				       '}';
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
}
