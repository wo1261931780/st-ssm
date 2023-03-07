package wo1261931780.stssm.junw.bbb016spring20230104.configuration;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


/**
 * @author junw
 */
public class Servlet0104Configuration extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{Spring0104Configuration001.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMvc0104Configuration001.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}


	@Override
	protected Filter[] getServletFilters() {
		// 在这里完成中文乱码的处理
		// 这里需要返回一个过滤器的数组
		// return super.getServletFilters();// 原始的返回体
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		// 这里设置的是字符串类型的过滤器
		encodingFilter.setEncoding("UTF-8");
		return new Filter[]{(Filter) encodingFilter};
	}
}
