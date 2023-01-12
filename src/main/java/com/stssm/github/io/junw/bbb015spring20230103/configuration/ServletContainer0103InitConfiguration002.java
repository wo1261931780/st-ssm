package com.stssm.github.io.junw.bbb015spring20230103.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author junw
 */
public class ServletContainer0103InitConfiguration002 extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// 这里和001的配置一样
		// 但是需要返回的是一个字节码文件
		// 因此，我们直接返回对应的配置类就是可以的
		return new Class[]{Spring0103Configuration001.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMvc0103Configuration001.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
