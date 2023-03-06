package wo1261931780.stssm.junw.bbb001spring20220730.factory;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao6;
import wo1261931780.stssm.junw.bbb001spring20220730.dao.impl.DemoDao6Impl;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Factory
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-14  星期日
 * @description
 */
public class DemoDao6Factory {
	public DemoDao6 getDemoDao6() {
		SHOW_LOG.debug("我是实例工厂中获取Dao6的方法");
		return new DemoDao6Impl();
	}
}
