package wo1261931780.stssm.junw.bbb007spring20220806.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb007spring20220806.dao.Demo0806Dao002;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository("demo0806Dao002")
@Slf4j
public class Demo0806Dao002Impl implements Demo0806Dao002 {


	/**
	 *
	 */
	@Override
	public void demo0806DaoShow002() {
		log.debug("我是Demo0806Dao002Impl中的demo0806DaoShow方法");
	}
}
