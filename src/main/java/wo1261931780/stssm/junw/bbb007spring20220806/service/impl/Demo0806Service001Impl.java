package wo1261931780.stssm.junw.bbb007spring20220806.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb007spring20220806.dao.Demo0806Dao001;
import wo1261931780.stssm.junw.bbb007spring20220806.service.Demo0806Service001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-08  星期一
 * @description
 */
@Service
@Slf4j
public class Demo0806Service001Impl implements Demo0806Service001 {
	@Autowired
	private Demo0806Dao001 demo0806Dao001;
	// Cannot invoke "com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao001.demo0806DaoShow()" because "this.demo0806Dao001" is null
	// 直接使用会导致报错,必须完成注入的过程


	// public void setDemo0806Dao001(Demo0806Dao001 demo0806Dao001) {
	// 	this.demo0806Dao001 = demo0806Dao001;
	// }
	// 如果我们上面添加了autowired注解
	// 这里就不需要继续使用set注入

	/**
	 *
	 */
	@Override
	public void demo0806Service001Show() {
		log.debug("我是Demo0806Service001中的demo0806Service001Show方法");
		demo0806Dao001.demo0806DaoShow();
	}
}
