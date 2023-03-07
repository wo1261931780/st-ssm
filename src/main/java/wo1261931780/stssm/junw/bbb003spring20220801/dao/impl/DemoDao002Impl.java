package wo1261931780.stssm.junw.bbb003spring20220801.dao.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao002;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
@Slf4j
public class DemoDao002Impl implements DemoDao002 {

	/**
	 *
	 */
	@Override
	public void dao002Show() {
		log.debug("我是Dao002中的show方法");
	}
}
