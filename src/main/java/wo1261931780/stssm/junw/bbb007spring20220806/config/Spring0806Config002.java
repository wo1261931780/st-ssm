package wo1261931780.stssm.junw.bbb007spring20220806.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-12  星期一
 * @description
 */
@Configuration
@ComponentScan("com.stssm.github.io.junw.bbb007spring20220806")
@PropertySource("Bbb024Jdbc.properties")
public class Spring0806Config002 {
	// 上面的配置文件，只能指定加载，
	// 不接受星号通配符
}
