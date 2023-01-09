package com.stssm.github.io.junw.bbb019spring20230108.controller;

public class Demo0108ResultController001 {
	// 这里面实际就是封装具体的返回结果
	// 前端从这三个返回结果里面去拿具体的信息
	// 这里面需要定义三个属性
	// data，msg信息，请求和返回的类型
	private Object returnData;
	private Integer returnCode;
	private String returnMessage;

	public Demo0108ResultController001() {
	}

	public Demo0108ResultController001(Object returnData) {
		this.returnData = returnData;
	}

	public Demo0108ResultController001(Object returnData, Integer returnCode) {
		// 其实这里是先返回数据类型，然后返回具体的结果，开发默认的规则
		// 这里就先这样写吧
		this.returnData = returnData;
		this.returnCode = returnCode;
	}

	@Override
	public String toString() {
		return "Demo0108ResultController001{" +
				       "returnData=" + returnData +
				       ", returnCode=" + returnCode +
				       ", returnMessage='" + returnMessage + '\'' +
				       '}';
	}

	public Demo0108ResultController001(Object returnData, Integer returnCode, String returnMessage) {
		this.returnData = returnData;
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
	}

	public Object getReturnData() {
		return returnData;
	}

	public void setReturnData(Object returnData) {
		this.returnData = returnData;
	}

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
}
