package wo1261931780.stssm.junw.bbb023spring20230113.configuration;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo2
 * Package:com.example.springbootdemo2.configuration
 *
 * @author liujiajun_junw
 * @Date 2023-01-10-25  星期五
 * @description
 */
@Configuration
public class MybatisPlusConfiguration {
	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();

		// 这里是分页的拦截器
		mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
		// 除了这个以外，我们碰到了乐观锁，所以我们也要添加一个对应的拦截器
		mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
		return mybatisPlusInterceptor;
	}
}
