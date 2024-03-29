package wo1261931780.stssm.junw.bbb001spring20220730.service.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao6;
import wo1261931780.stssm.junw.bbb001spring20220730.dao.impl.DemoDao6Impl;
import wo1261931780.stssm.junw.bbb001spring20220730.service.DemoService6;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-16-03  星期日
 * @description
 */
public class DemoService6Impl implements DemoService6 {
	/**
	 * 测试方法
	 */
	private DemoDao6 serviceDemoDao6;

	/**
	 * 测试方法
	 */
	public void setServiceDemoDao6(DemoDao6Impl innerDemoDao6) {
		this.serviceDemoDao6 = innerDemoDao6;
	}


	/**
	 * 测试方法
	 */
	@Override
	public void servieShow6() {
		SHOW_LOG.debug("我是service中的show6方法");
		String format = String.format("我是service中的Dao6对象：%s", serviceDemoDao6);
		SHOW_LOG.debug(format);
		SHOW_LOG.debug("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao6.show6();
	}
}
