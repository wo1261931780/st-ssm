package wo1261931780.stssm.junw.bbb016spring20230104;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb016spring20230104.configuration.Spring0104Configuration001;
import wo1261931780.stssm.junw.bbb016spring20230104.dao.Demo0104Dao001;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;


@Slf4j
/**
 * @author junw
 */
public class Bbb043 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring0104Configuration001.class);
		Demo0104Dao001 demo0104Dao001 = context.getBean(Demo0104Dao001.class);
		log.debug("我是获取到的demo0104Dao001对象：" + demo0104Dao001);
		log.debug(FINAL_SPLIT);
	}
}
