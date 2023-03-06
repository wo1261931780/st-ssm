package wo1261931780.stssm.junw.bbb009spring20220919.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-13-54  星期日
 * @description 配置SQLsession的工厂方法
 */
@Configuration
public class Spring0919MybatisConfiguration001 {
	// 这里实际上就是整合mybatis的位置
	// 我们上面已经整合了jdbc来操作数据库


	@Bean
	public SqlSessionFactoryBean getSqlSessionFactory(DruidDataSource dataSource) {
		// 我们如果直接创建SqlSessionFactory这个类
		// 就需要像xml一样，配置所有需要的内容
		// 整合以后，完全不需要这么麻烦
		SqlSessionFactoryBean demo = new SqlSessionFactoryBean();
		demo.setTypeAliasesPackage("com.stssm.github.io.junw.bbb009spring20220919.domain");
		demo.setDataSource(dataSource);// 根据上面的自动装配，这里直接添加一个dataSource就可以
		// 上面的所有操作，实际上都是为了创建一个DataSource对象
		return demo;
	}

	/**
	 * 其实还有一个事物处理的内容：
	 * <properties resource="Bbb019Jdbc.properties"></properties>
	 * 这里就是在创建mapper扫描器对象
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer x = new MapperScannerConfigurer();
		x.setBasePackage("com.github.io.junw.bbb009spring20220919.dao");
		// 这里就是在替代mapper扫描的包
		return x;
	}
}
