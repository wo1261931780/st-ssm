package com.stssm.github.io.junw.bbb004spring20220802;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao002;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-31  星期五
 * @description
 */
public class Bbb018 {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bbb021DataSource.xml");
		BeanFactory demo = new XmlBeanFactory(resource);
		Demo0802Dao002 xmlDemo0802DaoImpl002 = (Demo0802Dao002) demo.getBean("xmlDemo0802DaoImpl002");
		xmlDemo0802DaoImpl002.daoShow002();
		// 这里大部分内容都一样，不同之处在于加载的时机
		// 这里有个延迟加载bean，

		// *****************************************************
		// BeanFactory是延迟加载bean
		// 如果是applicationContext，就是立刻加载bean
		// 延迟加载，主要是构造器在初始化的过程中，是否会立刻加载对象
		// 如果是延迟加载，那么构造器完成构造，无参构造中间出现的方法不会立即执行
		// 本质差别在于，是否立刻加载好了对应的Bean对象
		// *****************************************************

	}
}
