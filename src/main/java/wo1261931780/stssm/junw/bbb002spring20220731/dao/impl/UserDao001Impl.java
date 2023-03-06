package wo1261931780.stssm.junw.bbb002spring20220731.dao.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.UserDao001;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.demorun;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-07-20-05  星期日
 * @description
 */
public class UserDao001Impl implements UserDao001, InitializingBean, DisposableBean {


	/**
	 *
	 */
	@Override
	public void destroy() {
		demorun.debug("我是UserDao001销毁方法");
		// 默认是不会执行这里的销毁方法
		// 因为虚拟机退出的时候，ioc容器不会主动关闭，只会随着虚拟机一起退出
	}

	/**
	 *
	 */
	@Override
	public void afterPropertiesSet() {
		demorun.debug("我是UserDao001初始化方法");
	}

	/**
	 * 展示结果
	 */
	@Override
	public void userDaoShow001() {
		demorun.debug("我是UserDao001中的构造方法");
	}
}
