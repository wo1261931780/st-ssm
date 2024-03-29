package wo1261931780.stssm.junw.bbb018spring20230106.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author junw
 */
public class SpringMvc0106SupportConfiguration001 extends WebMvcConfigurationSupport {
	// 在这里启用webMvc的支持

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// super.addResourceHandlers(registry);
		// 访问指定路径的时候，要求访问具体的html文件
		registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
		// 添加一个拦截器
		// 访问pages下面的任意文件
		// 2023年1月7日23:30:07摸鱼，没写代码
		// 就访问指定的目录
	}
}
