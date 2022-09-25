package com.stssm.github.io.junw.bbb009spring20220919.domain;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.domain
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-28  星期日
 * @description
 */
public class Account0919Dao {

	private int age;
	private String name;
	private String address;

	@Override
	public String toString() {
		return "Account0919Dao{" +
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
// --注释掉检查 STOP (2022-09-01 12:48)
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
