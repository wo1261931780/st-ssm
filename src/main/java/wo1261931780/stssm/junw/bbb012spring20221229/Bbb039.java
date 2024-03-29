package wo1261931780.stssm.junw.bbb012spring20221229;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb012spring20221229.config.Spring1229AopConfiguration002;
import wo1261931780.stssm.junw.bbb012spring20221229.dao.Demo1229Dao;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229
 *
 * @author liujiajun_junw
 * @Date 2022-12-18-58  星期四
 * @description
 */
public class Bbb039 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring1229AopConfiguration002.class);
		Demo1229Dao demo1229Dao = context.getBean(Demo1229Dao.class);
		demo1229Dao.show();
	}
}
