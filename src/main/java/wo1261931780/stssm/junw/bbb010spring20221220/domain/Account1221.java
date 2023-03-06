package wo1261931780.stssm.junw.bbb010spring20221220.domain;

import java.io.Serializable;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.domain
 *
 * @author liujiajun_junw
 * @Date 2022-12-14-57  星期一
 * @description
 */
public class Account1221 implements Serializable {
	private String name;
	private int age;
	private String address;

	@Override
	public String toString() {
		return "Account1221{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", address='" + address + '\'' +
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
