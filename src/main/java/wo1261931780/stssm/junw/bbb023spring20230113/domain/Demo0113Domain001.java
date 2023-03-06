package wo1261931780.stssm.junw.bbb023spring20230113.domain;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo2
 * Package:com.example.springbootdemo2.domain
 *
 * @author liujiajun_junw
 * @Date 2023-01-09-27  星期五
 * @description
 */
public class Demo0113Domain001 {

	/**
	 *
	 */
	private Integer id;

	/**
	 *
	 */
	private String name;

	/**
	 *
	 */
	private String password;

	/**
	 *
	 */
	private Integer age;

	/**
	 *
	 */
	private String tel;

	public Demo0113Domain001() {
	}

	public Demo0113Domain001(Integer id, String name, String password, Integer age, String tel) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Demo0113Domain001{" +
				       "id=" + id +
				       ", name='" + name + '\'' +
				       ", password='" + password + '\'' +
				       ", age=" + age +
				       ", tel='" + tel + '\'' +
				       '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
