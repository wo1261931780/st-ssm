package wo1261931780.stssm.junw.bbb003spring20220801;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao003;
import wo1261931780.stssm.junw.bbb003spring20220801.service.DemoService002;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801
 *
 * @author liujiajun_junw
 * @Date 2022-08-19-43  星期一
 * @description
 */
@Slf4j
public class Bbb011 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb012.xml");
		DemoDao003 xmlDemoDao003 = (DemoDao003) ctx.getBean("xmlDemoDao003");
		xmlDemoDao003.dao003Show();
		// Dao003的DI已经注入
		// 我是Dao003中的show方法
		// 传递age值：123
		// 传递address值：123
		log.debug("------------------------");
		DemoService002 xmlDemoService003 = (DemoService002) ctx.getBean("xmlDemoService002");
		xmlDemoService003.service002Show();
		// 我是service002show方法
		// 我是dao3中的show方法
		// 我是Dao003中的show方法
		// 传递age值：123
		// 传递address值：123
		// ------------------------
		// 因为service中使用了已经注入进去的Dao
		// 然后这个被调用的dao又使用了show方法，所以能看到数据
	}
}
