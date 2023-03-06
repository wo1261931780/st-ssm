package wo1261931780.stssm.junw.bbb006spring20220805.dao.impl;

import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao001;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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
public class Demo0805Dao001Impl implements Demo0805Dao001 {

	/**
	 * 测试方法
	 */
	@Override
	public void demo0805Dao001Show() {
		demorun.debug("我是demo0805Dao001中demo0805Dao001Show方法");
	}
}
