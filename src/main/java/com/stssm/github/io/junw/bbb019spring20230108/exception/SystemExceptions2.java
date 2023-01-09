package com.stssm.github.io.junw.bbb019spring20230108.exception;

public class SystemExceptions2 extends RuntimeException{
	private Integer exceptionCode;

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public SystemExceptions2() {
	}

	public SystemExceptions2(String message, Integer exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
	}

	public SystemExceptions2(String message, Throwable cause, Integer exceptionCode) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}
}
