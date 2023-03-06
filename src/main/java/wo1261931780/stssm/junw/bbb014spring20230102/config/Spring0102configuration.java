package wo1261931780.stssm.junw.bbb014spring20230102.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author junw
 */
@Configuration
@ComponentScan("com.stssm.github.io.junw.bbb014spring20230102")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Spring0102configuration {
	// @EnableTransactionManagement
	// 这里实际上就是告诉spring
	// 我要开始使用注解开发了
}
