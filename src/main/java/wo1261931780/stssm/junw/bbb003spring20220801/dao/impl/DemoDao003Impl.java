package wo1261931780.stssm.junw.bbb003spring20220801.dao.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao003;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
@Slf4j
public class DemoDao003Impl implements DemoDao003 {
	private int age;
	private String address;
	// 这里传递的简单类型数据，是在dao中设置的


	/**
	 *
	 */
	@Override
	public void dao003Show() {
		log.debug("我是Dao003中的show方法");
		String format = String.format("传递age值：%s", age);
		log.debug(format);
		String format1 = String.format("传递address值：%s", address);
		log.debug(format1);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
