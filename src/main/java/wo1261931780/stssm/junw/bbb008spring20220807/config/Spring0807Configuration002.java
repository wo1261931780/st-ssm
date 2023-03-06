package wo1261931780.stssm.junw.bbb008spring20220807.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-09-16  星期六
 * @description
 */
@Configuration
@ComponentScan({"com.stssm.github.io.junw.bbb008spring20220807"})
public class Spring0807Configuration002 {
	// 为了能够加载到其它包下面的类，就需要像上面一样，
	// @ComponentScan("com.stssm.github.io.config")	设置一个包扫描器
}
