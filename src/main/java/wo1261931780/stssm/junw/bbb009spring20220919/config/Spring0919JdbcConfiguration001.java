package wo1261931780.stssm.junw.bbb009spring20220919.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-13-49  星期日
 * @Description 这里主要是配置mybatis的连接。是无法避免的，必须添加
 */
@Configuration
public class Spring0919JdbcConfiguration001 {
	// @Configuration
	// 如果不添加这个注解，就需要手动使用import来完成导入


	@Value("${Jdbc1229Configuration.username}")
	private String name;
	@Value("${Jdbc1229Configuration.url}")
	private String url;
	@Value("${Jdbc1229Configuration.password}")
	private String password;
	@Value("${Jdbc1229Configuration.driver}")
	private String driver;

	@Bean
	public DataSource getDataSource() {
		DruidDataSource druidSource = new DruidDataSource();
		druidSource.setUsername(name);
		druidSource.setPassword(password);
		druidSource.setUrl(url);
		druidSource.setDriverClassName(driver);

		return druidSource;
	}


}
