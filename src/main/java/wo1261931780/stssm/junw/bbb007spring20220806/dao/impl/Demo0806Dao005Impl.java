package wo1261931780.stssm.junw.bbb007spring20220806.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb007spring20220806.dao.Demo0806Dao005;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository("demo0806Dao004")
@Slf4j
public class Demo0806Dao005Impl implements Demo0806Dao005 {

	@Value("${username024}")
	private String dao005Name002;

	/**
	 *
	 */
	@Override
	public void demo0806DaoShow005() {
		log.debug("我是Demo0806Dao005Impl中的demo0806DaoShow方法");
		String format = String.format("我是内部的变量002:%s", dao005Name002);
		log.debug(format);
	}
}
