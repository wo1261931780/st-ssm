package wo1261931780.stssm.junw.bbb019spring20230108.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import wo1261931780.stssm.junw.bbb019spring20230108.controller.interceptor.Demo0108Interceptor001;
import wo1261931780.stssm.junw.bbb019spring20230108.controller.interceptor.Demo0108Interceptor002;

/**
 * @author junw
 */
@Configuration
public class SpringMvc0108Support001 extends WebMvcConfigurationSupport {
	@Autowired
	private Demo0108Interceptor001 demo0108Interceptor001;
	@Autowired
	private Demo0108Interceptor002 demo0108Interceptor002;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// super.addInterceptors(registry);
		// registry.addInterceptor(demo0108Interceptor).addPathPatterns("/Demo0108BookController002");
		// 当我调用Demo0108BookController002这个请求的时候才进行拦截
		// registry.addInterceptor(demo0108Interceptor001).addPathPatterns("/Demo0108BookController002", "/Demo0108BookController002/*");
		// 除了默认参数会拦截
		// 路径下的所有带参操作也会拦截
		// 下面是拦截器链的处理过程
		// 如果出现了多个拦截器，那么就会按照这里的配置过程来执行
		registry.addInterceptor(demo0108Interceptor001).addPathPatterns("/Demo0108BookController002", "/Demo0108BookController002/*");
		registry.addInterceptor(demo0108Interceptor002).addPathPatterns("/Demo0108BookController002", "/Demo0108BookController002/*");
		// 这里的执行流程：
		// 首先执行preHandle001，然后执行preHandle002
		// 接着执行postHandle002，然后执行postHandle001
		// afterCompletion002和afterCompletion001同理
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
		registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		// super.addResourceHandlers(registry);
	}
}
