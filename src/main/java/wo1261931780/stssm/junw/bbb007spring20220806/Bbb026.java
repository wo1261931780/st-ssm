package wo1261931780.stssm.junw.bbb007spring20220806;

import com.stssm.github.io.junw.bbb007spring20220806.config.Spring0806Config002;
import com.stssm.github.io.junw.bbb007spring20220806.service.impl.Demo0806Service004Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-05  星期六
 * @description
 */
public class Bbb026 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0806Config002.class);
		Demo0806Service004Impl bean = ctx.getBean(Demo0806Service004Impl.class);
		String format = String.format("我是运行类%s", bean);
		demorun.debug(format);
		bean.demo0806Service004Show();
	}
}
