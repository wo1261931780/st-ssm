package com.stssm.github.io.junw.bbb018spring20230106.domain;
/**
 * @author junw
 */
public class Demo0106DomainUser001 {
	private String name;
	private int age;
	private Demo0106DomainBook001 demo0106DomainBook001;

	public Demo0106DomainUser001() {
	}

	public Demo0106DomainUser001(String name, int age, Demo0106DomainBook001 demo0106DomainBook001) {
		this.name = name;
		this.age = age;
		this.demo0106DomainBook001 = demo0106DomainBook001;
	}

	@Override
	public String toString() {
		return "Demo0106DomainUser001{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", demo0106DomainBook001=" + demo0106DomainBook001 +
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

	public Demo0106DomainBook001 getDemo0105DomainBook001() {
		return demo0106DomainBook001;
	}

	public void setDemo0105DomainBook001(Demo0106DomainBook001 demo0106DomainBook001) {
		this.demo0106DomainBook001 = demo0106DomainBook001;
	}
}
