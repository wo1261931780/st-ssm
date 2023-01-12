package com.stssm.github.io.junw.bbb019spring20230108.configuration;


import com.stssm.github.io.junw.bbb019spring20230108.controller.interceptor.Demo0108Interceptor001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @author junw
 */
@Configuration
@ComponentScan({"com.stssm.github.io.junw.bbb019spring20230108.controller","com.stssm.github.io.junw.bbb019spring20230108.configuration"})
@EnableWebMvc
public class springMvc0108configuration002 implements WebMvcConfigurer {
	// 这里只是将其整合到一起
	// 避免多余创建一个support类

	@Autowired
	private Demo0108Interceptor001 demo0108Interceptor001;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
		registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		// super.addResourceHandlers(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// super.addInterceptors(registry);
		// registry.addInterceptor(demo0108Interceptor).addPathPatterns("/Demo0108BookController002");
		// 当我调用Demo0108BookController002这个请求的时候才进行拦截
		registry.addInterceptor(demo0108Interceptor001).addPathPatterns("/Demo0108BookController002", "/Demo0108BookController002/*");
		// 除了默认参数会拦截
		// 路径下的所有带参操作也会拦截
	}
}
