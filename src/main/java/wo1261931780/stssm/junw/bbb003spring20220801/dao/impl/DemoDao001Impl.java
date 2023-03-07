package wo1261931780.stssm.junw.bbb003spring20220801.dao.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao001;

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
public class DemoDao001Impl implements DemoDao001 {
	/**
	 *
	 */
	@Override
	public void dao001Show() {
		log.debug("我是Dao001中的show方法");
	}
}
