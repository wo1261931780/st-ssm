package wo1261931780.stssm.junw.bbb004spring20220802;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wo1261931780.stssm.junw.bbb004spring20220802.dao.Demo0802Dao;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-01  星期四
 * @description
 */
@Slf4j
public class Bbb016 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bbb018DataSource.xml");
		Demo0802Dao demo0802DaoImpl = (Demo0802Dao) applicationContext.getBean("xmlDemo0802DaoImpl");
		log.debug("我是dao，即将开始执行方法：");
		demo0802DaoImpl.daoShow();
		// 我是Demo0802Dao中的show方法
		// 我是Demo0802Dao中的变量com.mysql.Jdbc1229Configuration.Driver

	}
}
