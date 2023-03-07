package wo1261931780.stssm.junw.bbb008spring20220807;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb008spring20220807.config.Spring0807Configuration002;

import javax.sql.DataSource;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807
 *
 * @author liujiajun_junw
 * @Date 2022-08-12-39  星期日
 * @description
 */
@Slf4j
public class Bbb028 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0807Configuration002.class);
		DataSource bean = ctx.getBean(DataSource.class);
		// 这里如果配置了多个datasource类，会出现报错
		// 因为默认是单例对象
		log.debug(bean.toString());
	}
}
