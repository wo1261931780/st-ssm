package com.stssm.github.io.junw.bbb018spring20230106.controller;

import com.stssm.github.io.junw.bbb018spring20230106.doamin.Demo0106DomainUser001;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo0106Controller001 {
	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public String toSave(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		System.out.println(demo0106DomainUser001);
		return "toSave方法执行";
	}
}
