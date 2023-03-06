package wo1261931780.junw.bbb009spring20220919.service;

import com.stssm.github.io.junw.bbb009spring20220919.config.Spring0919Configuration001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.stssm.github.io
 *
 * @author liujiajun_junw
 * @Date 2022-09-20-11  星期二
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring0919Configuration001.class)
public class TestService001 {

	private Demo0919Service001 demo0919Service001;

	@Test
	public void selectById() {
		demorun.debug("我是测试方法");
		// TestService002.debug(demo0919Service001.selectById(2));
	}
}
