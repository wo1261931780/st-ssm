package wo1261931780.stssm.junw.bbb008spring20220807.dao.impl;

import com.stssm.github.io.junw.bbb008spring20220807.dao.Demo0807Dao001;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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
public class Demo0807Dao001Impl implements Demo0807Dao001 {
	/**
	 *
	 */
	@Override
	public void dao0807show() {
		info.debug("我是Demo0807Dao001Impl中的show方法");
	}
}
