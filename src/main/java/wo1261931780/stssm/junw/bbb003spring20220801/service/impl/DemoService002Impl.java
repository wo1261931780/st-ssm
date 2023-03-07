package wo1261931780.stssm.junw.bbb003spring20220801.service.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao003;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.impl.DemoDao003Impl;
import wo1261931780.stssm.junw.bbb003spring20220801.service.DemoService002;

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
public class DemoService002Impl implements DemoService002 {
	private DemoDao003 demoDao003;

	/**
	 *
	 */
	@Override
	public void service002Show() {
		log.debug("我是service002show方法");
		log.debug("我是dao3中的show方法");
		demoDao003.dao003Show();
	}

	public void setDemoDao003(DemoDao003Impl xmlDemoDao003) {
		log.debug("Dao003的DI已经注入");
		this.demoDao003 = xmlDemoDao003;
	}
}
