package wo1261931780.stssm.junw.bbb001spring20220730.service.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao1;
import wo1261931780.stssm.junw.bbb001spring20220730.dao.impl.DemoDao1Impl;
import wo1261931780.stssm.junw.bbb001spring20220730.service.DemoService1;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-03  星期日
 * @description
 */
public class DemoService1Impl implements DemoService1 {
	private final DemoDao1 demoDao1 = new DemoDao1Impl();

	/**
	 *
	 */
	@Override
	public void serviceShow() {
		SHOW_LOG.debug("我是demoService中的show方法");
		SHOW_LOG.debug(demoDao1.toString());
		String format = String.format("调用了dao中的show方法%s", demoDao1);
		SHOW_LOG.debug(format);
		demoDao1.show();
	}
}
