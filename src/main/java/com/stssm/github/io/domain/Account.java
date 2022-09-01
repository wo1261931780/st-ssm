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

// --注释掉检查 START (2022-09-01 12:48):
// --注释掉检查 START (2022-09-01 12:48):
////	public int getAge() {
////		return age;
////	}
// --注释掉检查 START (2022-09-01 12:48):
////// --注释掉检查 START (2022-09-01 12:48):
//// --注释掉检查 STOP (2022-09-01 12:48)
// --注释掉检查 STOP (2022-09-01 12:48)
//// --注释掉检查 STOP (2022-09-01 12:48)
//
//	public void setAge(int age) {
// --注释掉检查 STOP (2022-09-01 12:48)
		this.age = age;
	}

// --注释掉检查 START (2022-09-01 12:48):
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
// --注释掉检查 STOP (2022-09-01 12:48)
		this.name = name;
	}

// --注释掉检查 START (2022-09-01 12:48):
//	public String getAddress() {
//		return address;
//	}
// --注释掉检查 STOP (2022-09-01 12:48)

	public void setAddress(String address) {
		this.address = address;
	}
}
