package wo1261931780.stssm.junw.bbb007spring20220806;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb007spring20220806.config.Spring0806Config;
import wo1261931780.stssm.junw.bbb007spring20220806.service.impl.Demo0806Service002Impl;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-05  星期六
 * @description
 */
@Slf4j
public class Bbb024 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0806Config.class);

		Demo0806Service002Impl bean = ctx.getBean(Demo0806Service002Impl.class);
		String format = String.format("我是运行类%s", bean);
		log.debug(format);
		bean.demo0806Service002Show();
	}
}
