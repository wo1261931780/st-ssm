package wo1261931780.stssm.junw.bbb006spring20220805.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb006spring20220805.dao.Demo0805Dao001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-34  星期五
 * @description
 */
@Repository
@Slf4j
public class Demo0805Dao001Impl implements Demo0805Dao001 {

	/**
	 * 测试方法
	 */
	@Override
	public void demo0805Dao001Show() {
		log.debug("我是demo0805Dao001中demo0805Dao001Show方法");
	}
}
