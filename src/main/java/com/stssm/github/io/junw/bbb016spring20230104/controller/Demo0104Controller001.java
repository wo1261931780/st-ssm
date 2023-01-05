package com.stssm.github.io.junw.bbb016spring20230104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Demo0104Controller001 {
	@RequestMapping("/Demo0104Controller001/showMe")
	@ResponseBody
	public String showMe() {
		// 在多人开发的场景下
		// 这种调配方式会出现问题
		// 我们为了避免名称重复和冲突，就会在里面添加上已经存在的类名作为路径
		System.out.println("我是Demo0104Controller001中的showMe方法");
		return "show me the money";
	}
}
