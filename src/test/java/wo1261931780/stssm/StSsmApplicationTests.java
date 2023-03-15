package wo1261931780.stssm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.stssm.junw.bbb021spring20230111.dao.Demo0111Dao001;
import wo1261931780.stssm.junw.bbb021spring20230111.service.Demo0111Service001;

@SpringBootTest(classes = StSsmApplication.class)
@Slf4j
class StSsmApplicationTests {
	// 这个测试类添加了SpringBootTest注解
	// 如果要添加一个

	// @Autowired
	// private Demo0111Service001 demo0111Service001;
	//
	// @Autowired
	// private Demo0111Dao001 demo0111Dao001;
	//
	// @Test
	// void contextLoads() {
	// 	demo0111Service001.serviceShow();
	// }
	//
	//
	// @Test
	// void getById() {
	// 	// return demo0111Dao001.getById(1);
	// }
}
