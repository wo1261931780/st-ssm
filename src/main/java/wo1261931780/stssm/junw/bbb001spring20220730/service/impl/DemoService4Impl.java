package wo1261931780.stssm.junw.bbb001spring20220730.service.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao4;
import wo1261931780.stssm.junw.bbb001spring20220730.dao.impl.DemoDao4Impl;
import wo1261931780.stssm.junw.bbb001spring20220730.service.DemoService4;

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
public class DemoService4Impl implements DemoService4 {

	private DemoDao4 serviceDemoDao4;

	public void setServiceDemoDao4(DemoDao4Impl innerDemoDao4) {
		this.serviceDemoDao4 = innerDemoDao4;
	}

	/**
	 *
	 */
	@Override
	public void servieShow4() {
		SHOW_LOG.debug("我是service中的show4方法");
		String format = String.format("我是service中的Dao4对象：%s", serviceDemoDao4);
		SHOW_LOG.debug(format);
		SHOW_LOG.debug("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao4.show4();
	}
}
