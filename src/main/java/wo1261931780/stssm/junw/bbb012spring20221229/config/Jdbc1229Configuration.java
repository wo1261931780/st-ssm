package wo1261931780.stssm.junw.bbb012spring20221229.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.config
 *
 * @author liujiajun_junw
 * @Date 2022-12-18-24  星期四
 * @description
 */
public class Jdbc1229Configuration {
	@Value("${jdbc1229.driver}")
	private String driver;

	@Value("${jdbc1229.userName}")
	private String userName;

	@Value("${jdbc1229.url}")
	private String url;

	@Value("${jdbc1229.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		return dataSource;
	}
}
