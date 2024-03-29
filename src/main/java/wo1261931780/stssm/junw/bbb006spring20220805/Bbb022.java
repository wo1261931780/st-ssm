package wo1261931780.stssm.junw.bbb006spring20220805;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb006spring20220805.config.SpringConfiguration0805;
import wo1261931780.stssm.junw.bbb006spring20220805.dao.Demo0805Dao003;
import wo1261931780.stssm.junw.bbb006spring20220805.dao.impl.Demo0805Dao003Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb006spring20220805
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-22  星期日
 * @description
 */
@Slf4j
public class Bbb022 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration0805.class);
		Demo0805Dao003 demo0805Dao003Impl = ctx.getBean(Demo0805Dao003Impl.class);
		demo0805Dao003Impl.demo0805Dao003Show();
		ctx.close();
	}
}
