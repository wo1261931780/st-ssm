package wo1261931780.stssm.junw.bbb019spring20230108.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author junw
 */
@Component
@Slf4j
public class Demo0108Interceptor001 implements HandlerInterceptor {
	// 拦截器是在spring环境中工作的
	// 因此必须受到spring的管理
	// 直接添加一个组件就可以

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// return HandlerInterceptor.super.preHandle(request, response, handler);
		// 在方法执行前拦截
		log.debug("我是preHandle方法");
		// return false;
		// 使用false，表示终止了所有原始操作的东西
		// 这里如果使用了false，那么底下的所有拦截器都不会执行
		// 所以默认是使用true
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		// 在方法执行后拦截
		log.debug("我是postHandle方法");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		// 在方法完成的时候拦截
		log.debug("我是afterCompletion方法");
	}
}
