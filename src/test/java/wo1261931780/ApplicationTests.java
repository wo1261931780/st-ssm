package wo1261931780;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		demorun.debug("测试方法");
	}

}
