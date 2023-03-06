package wo1261931780.stssm.junw.bbb001spring20220730.factory;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao6;
import com.stssm.github.io.junw.bbb001spring20220730.dao.impl.DemoDao6Impl;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.factory
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-51  星期六
 * @description
 */
public class DemoDao6FactoryBean implements FactoryBean<DemoDao6> {
	// 这种工厂方法,是对原有模式的一次改进
	// 比如之前我们使用静态和实例工厂,都是需要初始化一次
	// 但是现在,只需要实现对应的FactoryBean就可以,因为泛型中间填入了对应的类

	@Override
	public DemoDao6 getObject() {
		return new DemoDao6Impl();
		// 这里替代了之前的dao方法,返回的是一个dao对应的实现类
	}

	@Override
	public Class<?> getObjectType() {
		return DemoDao6.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();// 可以直接在这里修改是否是单例对象
	}
}
