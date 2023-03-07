package com.stssm.github.io.junw.bbb019spring20230108.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import wo1261931780.stssm.junw.bbb019spring20230108.configuration.Spring0108Configuration001;
import wo1261931780.stssm.junw.bbb019spring20230108.configuration.SpringMvc0108configuration001;

public class Servlet0108Configuration001 extends AbstractAnnotationConfigDispatcherServletInitializer {
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{Spring0108Configuration001.class};
		// 上下两个方法制造出来的对象不是同一个
		// 而且
		// springmvc容器可以访问spring容器
		// 但是spring容器无法访问springmvc的容器
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMvc0108configuration001.class};
	}

	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
