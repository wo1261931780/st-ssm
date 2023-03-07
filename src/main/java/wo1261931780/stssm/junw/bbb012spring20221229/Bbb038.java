package wo1261931780.stssm.junw.bbb012spring20221229;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb012spring20221229.config.Spring1229AopConfiguration;
import wo1261931780.stssm.junw.bbb012spring20221229.dao.Demo1229Dao;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229
 *
 * @author liujiajun_junw
 * @Date 2022-12-18-01  星期四
 * @description
 */
@Slf4j
public class Bbb038 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring1229AopConfiguration.class);
		Demo1229Dao demo1229Dao = context.getBean(Demo1229Dao.class);
		demo1229Dao.show();
		log.debug(FINAL_SPLIT);
	}
}
