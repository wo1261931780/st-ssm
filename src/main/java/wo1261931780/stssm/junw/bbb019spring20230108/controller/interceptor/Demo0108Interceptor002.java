package wo1261931780.stssm.junw.bbb019spring20230108.controller.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author junw
 */
@Component
@Slf4j
public class Demo0108Interceptor002 implements HandlerInterceptor {
	// 三个方法中，实用性最强大的还是preHandle
	// 因为这个方法可以在使用之前做校验

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		String contentType = request.getContentType();
		log.debug("我是preHandle方法" + contentType);
		// 这里可以根据api，直接拿到原始的数据
		log.debug("" + handler);
		// 这里返回的结果：控制器类+方法+参数
		HandlerMethod demoHandlerMethod = (HandlerMethod) handler;
		log.debug("" + demoHandlerMethod);// 通过反射拿到原始执行的对象
		// demoHandlerMethod.getMethod();
		// 拿到对象以后，执行任何方法都是可以的
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
		log.debug("我是postHandle方法");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		log.debug("我是afterCompletion方法");
	}
}
