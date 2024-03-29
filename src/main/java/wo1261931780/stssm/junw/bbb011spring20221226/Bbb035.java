package wo1261931780.stssm.junw.bbb011spring20221226;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb011spring20221226.config.Spring1226Configuration001;
import wo1261931780.stssm.junw.bbb011spring20221226.dao.Demo1226Dao;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226
 *
 * @author liujiajun_junw
 * @Date 2022-12-20-16  星期三
 * @description
 */
@Slf4j
public class Bbb035 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring1226Configuration001.class);
		Demo1226Dao demo1226Dao = applicationContext.getBean(Demo1226Dao.class);
		demo1226Dao.show();
		log.debug("" + demo1226Dao);
		// com.stssm.github.io.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl@babafc2
		// 不管后面有没有匹配上我们的aop方法，这里都会创建一个实现类对应的对象
		log.debug("" + demo1226Dao.getClass());// class jdk.proxy2.$Proxy20
		// 这里创建的就是一个代理对象
		// aop本质上，就是通过代理实现的
	}
}
