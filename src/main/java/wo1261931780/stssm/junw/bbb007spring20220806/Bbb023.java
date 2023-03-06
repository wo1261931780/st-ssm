package wo1261931780.stssm.junw.bbb007spring20220806;

import com.stssm.github.io.junw.bbb007spring20220806.config.Spring0806Config;
import com.stssm.github.io.junw.bbb007spring20220806.service.impl.Demo0806Service001Impl;
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
public class Bbb023 {
	public static void main(String[] args) {
		// 这里就直接讲自动装配
		// spring为了简化开发，只保留了必要的功能，一部分功能已经被阉割掉
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0806Config.class);
		Demo0806Service001Impl bean = ctx.getBean(Demo0806Service001Impl.class);
		String format = String.format("我是运行类%s", bean);
		demorun.debug(format);
		bean.demo0806Service001Show(); // Cannot invoke "com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao001.demo0806DaoShow()" because "this.demo0806Dao001" is null
		// 直接使用会导致报错
		// 这里是因为没有注入成功，正好解释了昨天的报错问题
		// 因为我们业务层的对象，没有进行装配
	}
}
