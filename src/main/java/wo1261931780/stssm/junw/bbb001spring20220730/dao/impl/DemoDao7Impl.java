package wo1261931780.stssm.junw.bbb001spring20220730.dao.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao7;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-17-02  星期日
 * @description
 */
public class DemoDao7Impl implements DemoDao7 {

	public DemoDao7Impl() {
		String format = String.format("我是dao7构造方法，地址为：%s", this);
		SHOW_LOG.debug(format);
	}

	/**
	 *
	 */
	@Override
	public void show7() {
		SHOW_LOG.debug("我是dao方法中的show7");
	}
}
