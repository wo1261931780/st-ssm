package com.stssm.github.io.junw.bbb016spring20230104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;


/**
 * @author junw
 */
@Controller
@RequestMapping("/Demo0104Controller004")
public class Demo0104Controller004 {

	@RequestMapping("/showMe")
	@ResponseBody
	public String showMe() {
		demorun.debug("我是Demo0104Controller004中的showMe方法");
		return "show me the money";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete() {
		demorun.debug("我是Demo0104Controller004中的delete方法");
		return "delete";
	}

	@RequestMapping("/getParams")
	@ResponseBody
	public String getParams(String name, String age, String address) {
		demorun.debug("我是Demo0104Controller004中的getParams方法");
		demorun.debug("我是参数1：" + name);
		demorun.debug("我是参数2：" + age);
		demorun.debug("我是参数3：" + address);
		// 这里需要说明一下，后端是不区分get和post的
		// 但是post需要发送的是包含在请求体中的表单
		// post中，默认是英文和数字，
		// 如果需要发送中文，后端可能会乱码
		return "getParams";
	}
}
