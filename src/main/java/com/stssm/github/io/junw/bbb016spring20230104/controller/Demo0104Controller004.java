package com.stssm.github.io.junw.bbb016spring20230104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author junw
 */
@Controller
@RequestMapping("/Demo0104Controller004")
public class Demo0104Controller004 {

	@RequestMapping("/showMe")
	@ResponseBody
	public String showMe() {
		System.out.println("我是Demo0104Controller004中的showMe方法");
		return "show me the money";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete() {
		System.out.println("我是Demo0104Controller004中的delete方法");
		return "delete";
	}

	@RequestMapping("/getParams")
	@ResponseBody
	public String getParams(String name, String age, String address) {
		System.out.println("我是Demo0104Controller004中的getParams方法");
		System.out.println("我是参数1：" + name);
		System.out.println("我是参数2：" + age);
		System.out.println("我是参数3：" + address);
		// 这里需要说明一下，后端是不区分get和post的
		// 但是post需要发送的是包含在请求体中的表单
		// post中，默认是英文和数字，
		// 如果需要发送中文，后端可能会乱码
		return "getParams";
	}
}
