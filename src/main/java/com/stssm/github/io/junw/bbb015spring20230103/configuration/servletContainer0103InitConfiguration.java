package com.stssm.github.io.junw.bbb015spring20230103.configuration;

// public class servletContainer0104InitConfiguration extends AbstractDispatcherServletInitializer {
	// protected WebApplicationContext createServletApplicationContext() {
	// 	// 用来加载springMvc的容器配置
	// 	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	// 	// 因为普通的容器不能使用在web环境，所以这里需要使用不一样的配置
	// 	// 因为容器刚刚出现，没有初始化
	// 	context.register(SpringMvc0103Configuration001.class);
	// 	// tomcat容器启动的时候就会使用这个配置
	// 	return context;
	// }
	//
	// protected String[] getServletMappings() {
	// 	// 设置有哪些请求归属springMvc处理
	// 	// return new String[0];
	// 	return new String[]{"/"};
	// 	// 这样设置，spring中的所有请求，都会归spring管理和设置
	// }
	//
	// protected WebApplicationContext createRootApplicationContext() {
	// 	// 加载spring容器的配置
	// 	// return null;
	// 	// 和上面的配置一模一样，唯一需要修改的就是加载的配置种类
	// 	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	// 	context.register(Spring0103Configuration001.class);
	// 	return context;
	// }
	// // 定义一个tomcat的启动容器配置
// }
