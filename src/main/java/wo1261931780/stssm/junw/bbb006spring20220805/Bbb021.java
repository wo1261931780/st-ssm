package wo1261931780.stssm.junw.bbb006spring20220805;

import com.stssm.github.io.junw.bbb006spring20220805.config.SpringConfiguration0805;
import com.stssm.github.io.junw.bbb006spring20220805.dao.impl.Demo0805Dao002Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb006spring20220805
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-46  星期五
 * @description
 */
public class Bbb021 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration0805.class);
		Demo0805Dao002Impl bean = ctx.getBean(Demo0805Dao002Impl.class);
		Demo0805Dao002Impl bean2 = ctx.getBean(Demo0805Dao002Impl.class);
		info.debug(bean.toString());
		// com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao004Impl@b62d79
		info.debug("----------------------------------------------");
		info.debug(bean2.toString());
		// com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao004Impl@6631f5ca
		// 上面测试的就是非单例的情况
		ctx.close();
	}
}
