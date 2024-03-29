package wo1261931780.stssm.junw.bbb003spring20220801.service.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao001;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao002;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.impl.DemoDao001Impl;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.impl.DemoDao002Impl;
import wo1261931780.stssm.junw.bbb003spring20220801.service.DemoService001;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-50  星期五
 * @description
 */
@Slf4j
public class DemoService001Impl implements DemoService001 {
	private DemoDao001 demoDao001;
	private DemoDao002 demoDao002;

	/**
	 *
	 */
	@Override
	public void service001Show() {
		log.debug("我是service001show方法");
		log.debug("我是dao1中的show方法");
		demoDao001.dao001Show();
		log.debug("我是dao2中的show方法");
		demoDao002.dao002Show();
	}

	public void setDemoDao001(DemoDao001Impl xmlDemoDao001) {
		log.debug("我是DI注入，对象为demoDao001");
		this.demoDao001 = xmlDemoDao001;
	}

	public void setDemoDao002(DemoDao002Impl xmlDemoDao002) {
		log.debug("我是DI注入，对象为demoDao002");
		this.demoDao002 = xmlDemoDao002;
	}
}
