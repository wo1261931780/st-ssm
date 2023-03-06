package wo1261931780.stssm.junw.bbb003spring20220801.dao.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao005;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
public class DemoDao005Impl implements DemoDao005 {
	private int age;
	private String address;


	@Override
	public void dao005Show() {
		demorun.debug("我是Dao005中的show方法");
		String format = String.format("传递age值：%s", age);
		demorun.debug(format);
		String format1 = String.format("传递address值：%s", address);
		demorun.debug(format1);
	}

	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
