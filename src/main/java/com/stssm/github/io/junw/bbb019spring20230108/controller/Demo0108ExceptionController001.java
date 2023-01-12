package com.stssm.github.io.junw.bbb019spring20230108.controller;


import com.stssm.github.io.junw.bbb019spring20230108.exception.SystemException;
import com.stssm.github.io.junw.bbb019spring20230108.exception.System2Exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 表现层异常处理模块
 *
 * @author 刘佳珺
 * @since 2023-01-08 11:37:04
 */
@RestControllerAdvice
public class Demo0108ExceptionController001 {

	@ExceptionHandler(Exception.class)
	public Demo0108ResultController001 systemExceptionHandle(SystemException systemExceptionHandle) {
		System.out.println("出现了系统级别的异常，信息：" + systemExceptionHandle);
		Demo0108ResultController001 resultController001 = new Demo0108ResultController001();
		resultController001.setReturnMessage(systemExceptionHandle.getMessage());
		resultController001.setReturnCode(systemExceptionHandle.getExceptionCode());
		// resultController001.setReturnCode(Demo0108CodeController001.GET_QUERY_CODE_OK);
		resultController001.setReturnData(null);
		// 处理系统异常，这里是拦截器，所以直接获取异常中携带的信息就可以解决
		return resultController001;
	}

	@ExceptionHandler(Exception.class)
	public Demo0108ResultController001 systemExceptionHandle2(System2Exception systemExceptionHandle2) {
		System.out.println("出现了业务异常，信息：" + systemExceptionHandle2);
		Demo0108ResultController001 resultController001 = new Demo0108ResultController001();
		resultController001.setReturnMessage(systemExceptionHandle2.getMessage());
		resultController001.setReturnCode(systemExceptionHandle2.getExceptionCode());
		resultController001.setReturnData(null);
		// 这里是处理业务异常
		// 虽然已经处理完了，但是底下的统一处理还是需要保留
		// 所以这里其实只是为了做部分拦截而已
		return resultController001;
	}

	@ExceptionHandler(Exception.class)
	public Demo0108ResultController001 exceptionHandle(Exception exceptionHandle) {
		System.out.println("出现了异常，信息：" + exceptionHandle);
		Demo0108ResultController001 resultController001 = new Demo0108ResultController001();
		// 其实这里可以直接使用带参构造来返回带有具体信息的返回体
		resultController001.setReturnMessage("系统繁忙，请稍后再试");
		// 因为这里是未知异常，所以我们需要手动处理返回信息
		resultController001.setReturnCode(Demo0108CodeController001.UNKNOWN_EXCEPTION_CODE_ERR);
		resultController001.setReturnData(null);
		return resultController001;
	}
}
