package wo1261931780.stssm.junw.bbb014spring20230102;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb014spring20230102.config.Spring0102configuration;
import wo1261931780.stssm.junw.bbb014spring20230102.service.Demo0102Service;



/**
 * @author junw
 */
@Slf4j
public class Bbb041 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring0102configuration.class);
		// Demo0102Dao demo0102Dao = context.getBean(Demo0102Dao.class);
		// demo0102Dao.show0102dao("url", "paw");
		// 因为这里是存在对应的业务层对象service，而且业务层对象中有对应的dao调用，所以这里直接调用service中的方法即可

		Demo0102Service bean = context.getBean(Demo0102Service.class);
		log.debug("我是返回结果：" + bean.show0102service("123", "root "));
		// 这里是可以执行删除空格操作的
		// 但因为是trim,所以只能删除前后的空格,不能删除字符串中间的空格
	}
}
