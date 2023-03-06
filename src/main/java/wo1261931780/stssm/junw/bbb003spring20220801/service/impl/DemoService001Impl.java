package wo1261931780.stssm.junw.bbb003spring20220801.service.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao001;
import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao002;
import com.stssm.github.io.junw.bbb003spring20220801.dao.impl.DemoDao001Impl;
import com.stssm.github.io.junw.bbb003spring20220801.dao.impl.DemoDao002Impl;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-50  星期五
 * @description
 */
public class DemoService001Impl implements DemoService001 {


	private DemoDao001 demoDao001;
	private DemoDao002 demoDao002;

	/**
	 *
	 */
	@Override
	public void service001Show() {
		demorun.debug("我是service001show方法");
		demorun.debug("我是dao1中的show方法");
		demoDao001.dao001Show();
		demorun.debug("我是dao2中的show方法");
		demoDao002.dao002Show();
	}

	public void setDemoDao001(DemoDao001Impl xmlDemoDao001) {
		demorun.debug("我是DI注入，对象为demoDao001");
		this.demoDao001 = xmlDemoDao001;
	}

	public void setDemoDao002(DemoDao002Impl xmlDemoDao002) {
		demorun.debug("我是DI注入，对象为demoDao002");
		this.demoDao002 = xmlDemoDao002;
	}
}
