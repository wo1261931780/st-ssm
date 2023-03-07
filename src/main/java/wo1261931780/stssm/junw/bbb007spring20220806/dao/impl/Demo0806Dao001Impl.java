package wo1261931780.stssm.junw.bbb007spring20220806.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb007spring20220806.dao.Demo0806Dao001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository
@Slf4j
public class Demo0806Dao001Impl implements Demo0806Dao001 {
	// 我们找到dao就会发现
	// 这里并没有对dao设置具体的名称
	// 所以autowired就是按照类型完成装配的

	/**
	 *
	 */
	@Override
	public void demo0806DaoShow() {
		log.debug("我是Demo0806Dao001Impl中的demo0806DaoShow方法");
	}
}
