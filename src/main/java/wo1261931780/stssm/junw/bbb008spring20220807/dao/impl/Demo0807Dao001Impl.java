package wo1261931780.stssm.junw.bbb008spring20220807.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb008spring20220807.dao.Demo0807Dao001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-09-00-00  星期日
 * @description
 */
@Repository
@Slf4j
public class Demo0807Dao001Impl implements Demo0807Dao001 {
	/**
	 *
	 */
	@Override
	public void dao0807show() {
		log.debug("我是Demo0807Dao001Impl中的show方法");
	}
}
