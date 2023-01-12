package com.stssm.github.io.junw.bbb016spring20230104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;


/**
 * @author junw
 */
@Controller
public class Demo0104Controller002 {
	@RequestMapping("/Demo0104Controller002/delete")
	@ResponseBody
	public String delete() {
		demorun.debug("我是Demo0104Controller002中的delete方法");
		return "delete";
	}
}
