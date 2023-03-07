package wo1261931780.stssm.junw.bbb007spring20220806.dao.impl;

import com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao002;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository("demo0806Dao003")
public class Demo0806Dao003Impl implements Demo0806Dao002 {

	/**
	 *
	 */
	@Override
	public void demo0806DaoShow002() {
		info.debug("我是Demo0806Dao002Impl中的demo0806DaoShow方法");
	}
}
