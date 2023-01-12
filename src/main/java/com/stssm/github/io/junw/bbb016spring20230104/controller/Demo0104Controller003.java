package com.stssm.github.io.junw.bbb016spring20230104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author junw
 */
@Controller
@RequestMapping("/Demo0104Controller003")
public class Demo0104Controller003 {
	// 如果一个controller中存在着很多的方法
	// 那么反复添加路径，会导致访问麻烦，同时不利于我们开发
	// 这里就使用统一的注解，在上面直接完成添加操作

	@RequestMapping("/showMe")
	@ResponseBody
	public String showMe() {
		System.out.println("我是Demo0104Controller003中的showMe方法");
		return "show me the money";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete() {
		System.out.println("我是Demo0104Controller003中的delete方法");
		return "delete";
	}

	@RequestMapping("/getParams")
	@ResponseBody
	public String getParams(String name, String age, String address) {
		System.out.println("我是Demo0104Controller003中的getParams方法");
		System.out.println("我是参数1：" + name);
		// 如果要接收参数，直接在get中设置，这里就可以拿到对应的值
		System.out.println("我是参数2：" + age);
		// 好像前端的参数和后端的参数没有区别，这里都可以认定为字符串进行接收操作
		System.out.println("我是参数3：" + address);
		// 如果对应的变量和前端传递过来的参数不一样
		// 那么这里 就会直接返回为null
		// 注意一下postman中的写法：
		// http://localhost/Demo0104Controller003/getParams?name=123&age=222&address=address
		// 不同的变量之间，是直接使用字符串?和&号进行连接的
		// 那么我们反过来说，也可以直接根据地址栏的链接，反向进行参数的解析操作
		return "getParams";
	}
}
