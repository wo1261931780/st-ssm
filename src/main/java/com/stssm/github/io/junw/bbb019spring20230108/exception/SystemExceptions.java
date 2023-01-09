package com.stssm.github.io.junw.bbb019spring20230108.exception;

public class SystemExceptions extends RuntimeException{
	private Integer exceptionCode;

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public SystemExceptions() {
	}

	public SystemExceptions(String message, Integer exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
	}

	public SystemExceptions(String message, Throwable cause, Integer exceptionCode) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
	}
}
