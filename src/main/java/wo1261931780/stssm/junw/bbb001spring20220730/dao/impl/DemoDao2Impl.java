package wo1261931780.stssm.junw.bbb001spring20220730.dao.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao2;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-02  星期日
 * @description
 */
public class DemoDao2Impl implements DemoDao2 {
	/**
	 *
	 */
	@Override
	public void show2() {
		SHOW_LOG.debug("我是dao方法中的show2");
	}
}
