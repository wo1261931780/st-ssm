package wo1261931780.stssm.junw.bbb008spring20220807;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb008spring20220807.config.Spring0807Configuration005;
import wo1261931780.stssm.junw.bbb009spring20220919.domain.Account0919;
import wo1261931780.stssm.junw.bbb009spring20220919.service.Demo0919Service001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-33  星期日
 * @description
 */
@Slf4j
public class Bbb030 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0807Configuration005.class);
		// DataSource bean = ctx.getBean(DataSource.class);
		// 这里有点不理解
		// 如果我手动获取了一个DataSource对象
		// 那么就会报错，不是单例的，内部已经存在了一个datasource
		log.debug(ctx.toString());
		Demo0919Service001 bean = ctx.getBean(Demo0919Service001.class);
		bean.show();
		// Account0919 account = bean.selectById(2);
		// log.debug("我是SQL找到的对象：" + account);
	}
}
