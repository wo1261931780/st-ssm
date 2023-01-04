package com.stssm.github.io.junw.bbb015spring20230103.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class servletContainer0103InitConfiguration002 extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// 这里和001的配置一样
		// 但是需要返回的是一个字节码文件
		// 因此，我们直接返回对应的配置类就是可以的
		return new Class[]{spring0103Configuration001.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{springMvc0103Configuration001.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
