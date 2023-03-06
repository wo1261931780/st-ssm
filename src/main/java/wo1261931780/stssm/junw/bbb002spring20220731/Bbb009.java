package wo1261931780.stssm.junw.bbb002spring20220731;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.UserDao002;
import wo1261931780.stssm.junw.bbb002spring20220731.factory.Factory0731;
import wo1261931780.stssm.junw.bbb002spring20220731.service.UserService002;
import wo1261931780.stssm.junw.bbb002spring20220731.sfactory.StaticFactory0731;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-41  星期三
 * @description
 */
public class Bbb009 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb009.xml");
		// 13:00:14.788 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@4411d970
		// 13:00:14.994 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 5 bean definitions from class path resource [bbb009.xml]
		// 13:00:15.035 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlUserDao002'
		// 我是UserDao002初始化方法
		// =============================================完成了Dao的初始化
		// 13:00:15.047 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlUserService002'
		// 已经完成了UserService002Impl中对UserDao002Impl的依赖注入
		// 我是serviceDao1中的初始化方法
		// =============================================完成了service的初始化，依赖注入完成
		// 13:00:15.087 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlFactory0731'
		// 13:00:15.087 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlFactory'
		// 已经通过实例工厂Factory0731获得一个UserDao002Impl
		// 我是UserDao002初始化方法
		// =============================================构造静态工厂和实例工厂，都会新建对象，这个时候，初始化就已经完成
		// 13:00:15.089 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'staticFactory0731'
		// 已经通过静态工厂staticFactory0731获得一个UserDao002Impl
		// 我是UserDao002初始化方法
		// =============================================
		// 这里可以根据控制台信息来分析结果：
		// 在加载完成配置文件以后，就会自动获取对应的实例工厂和静态工厂
		// 因为内部只有一个构造器方法，所以会自动完成单例的构造
		SHOW_LOG.debug("获得一个实例工厂对象：");
		Factory0731 factory0731 = (Factory0731) ctx.getBean("xmlFactory0731");
		SHOW_LOG.debug("实例工厂获得Dao001对象");
		UserDao002 factoryGetDao001 = factory0731.factoryGetDao001();
		factoryGetDao001.userDaoShow002();
		SHOW_LOG.debug(FINAL_SPLIT);
		// 获得一个实例工厂对象：
		// 实例工厂获得Dao001对象
		// 已经通过实例工厂Factory0731获得一个UserDao002Impl
		// 我是UserDao002中的构造方法
		// =============================================
		SHOW_LOG.debug("获得一个静态工厂：");
		UserDao002 staticFactoryGetDao002 = StaticFactory0731.factoryGetDao002();
		SHOW_LOG.debug("静态工厂获得Dao001对象：");
		staticFactoryGetDao002.userDaoShow002();
		SHOW_LOG.debug(FINAL_SPLIT);
		// 获得一个静态工厂：
		// 已经通过静态工厂staticFactory0731获得一个UserDao002Impl
		// 静态工厂获得Dao001对象：
		// 我是UserDao002中的构造方法
		// =============================================
		SHOW_LOG.debug("手动构造了一个xmlUserService002：");
		UserService002 xmlUserService002 = (UserService002) ctx.getBean("xmlUserService002");
		xmlUserService002.serviceShow();
		SHOW_LOG.debug(FINAL_SPLIT);
		// 手动构造了一个xmlUserService002：
		// 我是UserService002中的show方法
		// =============================================
		SHOW_LOG.debug("手动构造了一个xmlUserDao002：");
		UserDao002 xmlUserDao002 = (UserDao002) ctx.getBean("xmlUserDao002");
		xmlUserDao002.userDaoShow002();
		// 手动构造了一个xmlUserDao002：
		// 我是UserDao002中的构造方法
		// =============================================
		// 实例工厂新建对象，和静态工厂一样，新建完成没有执行初始化
		// 因为在xml获得bean映射关系的时候，就已经做好了初始化的过程
		// 又因为对象是单例的，所以不需要重复做初始化
	}
}
