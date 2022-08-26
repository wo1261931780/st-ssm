package com.stssm.github.io.junw.bbb004spring20220802;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao001;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-30  星期二
 * @description
 */
public class Bbb017 {
	public static void main(String[] args) {
		// 加载容器的形式有很多
		// 这是第一种：加载类路径下的配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb018SpringContext.xml");
		// 如果从文件系统加载容器，就需要指定绝对路径
		// 第二种，从文件系统下加载配置文件
		// ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\1\\Documents\\GitHub\\st-ssm.github.io\\src\\main\\resources\\bbb018SpringContext.xml");
		// 我们一般还是使用上面那种按照类路径完成加载
		// --------------------------------------------------------------------------------------------------
		// Demo0802Dao001 demo0802Dao001 = (Demo0802Dao001) ctx.getBean("Demo0802Dao001");// 第一种
		// 第一种有问题，每次都需要强制转换格式
		// --------------------------------------------------------------------------------------------------
		// Demo0802Dao001 demo0802Dao001 = ctx.getBean("Demo0802Dao001", Demo0802Dao001.class);// 第二种，获取字节码文件
		// 指定具体的类型，那么就可以避免类型发生异常
		// 这种带上文件字节码的形式，就不需要进行强转操作
		// --------------------------------------------------------------------------------------------------
		Demo0802Dao001 userDao5 = ctx.getBean(Demo0802Dao001.class);// 第三种，直接指定
		// 但是这种指定的方式，无法加载多个类，
		// 指定名称的类，只能存在一个
		userDao5.daoShow001();
		// 在源码中
		// 从applicationContext往上追加
		// 最后会找到顶层的BeanFactory接口
	}
}
