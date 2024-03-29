package wo1261931780.stssm.junw.bbb009spring20220919;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb009spring20220919.config.Spring0919Configuration001;
import wo1261931780.stssm.junw.bbb009spring20220919.dao.Demo0919Dao001;
import wo1261931780.stssm.junw.bbb009spring20220919.domain.Account0919;
import wo1261931780.stssm.junw.bbb009spring20220919.service.Demo0919Service001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb009spring20220918
 *
 * @author liujiajun_junw
 * @Date 2022-09-21-48  星期日
 * @description
 */
@Slf4j
public class Bbb031 {
	public static void main(String[] args) {
		// ApplicationContext x = new AnnotationConfigApplicationContext(Spring0919Configuration001.class);
		ApplicationContext x = new AnnotationConfigApplicationContext(Spring0919Configuration001.class);
		Demo0919Dao001 bean = x.getBean(Demo0919Dao001.class);
		bean.daoShow001();
		Demo0919Service001 bean1 = x.getBean(Demo0919Service001.class);
		Account0919 account0919Dao = bean1.selectById(2);
		log.debug(account0919Dao.toString());
	}
}
