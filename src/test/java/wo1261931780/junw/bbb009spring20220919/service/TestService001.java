package wo1261931780.junw.bbb009spring20220919.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wo1261931780.stssm.junw.bbb009spring20220919.config.Spring0919Configuration001;
import wo1261931780.stssm.junw.bbb009spring20220919.service.Demo0919Service001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.stssm.github.io
 *
 * @author liujiajun_junw
 * @Date 2022-09-20-11  星期二
 * @description
 */
@Slf4j
@ContextConfiguration(classes = Spring0919Configuration001.class)
public class TestService001 {

	private Demo0919Service001 demo0919Service001;

	@Test
	public void selectById() {
		log.debug("我是测试方法");
		// TestService002.debug(demo0919Service001.selectById(2));
	}
}
