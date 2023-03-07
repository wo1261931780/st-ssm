package wo1261931780.stssm.junw.bbb013spring20221231;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb013spring20221231.config.Spring1231Configuration;
import wo1261931780.stssm.junw.bbb013spring20221231.dao.Demo1231Dao;

@Slf4j
/**
 * @author junw
 */
public class Bbb040 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring1231Configuration.class);
		Demo1231Dao demo1231Dao = context.getBean(Demo1231Dao.class);
		log.debug(demo1231Dao.findName(11));
	}
}
