package com.stssm.github.io.junw.bbb017spring20230105.controller;

import com.stssm.github.io.junw.bbb017spring20230105.domain.Demo0105DomainUser001;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@Controller
@RequestMapping("/Demo0105Controller001")
public class Demo0105Controller001 {
	@RequestMapping("/insert")
	@ResponseBody
	public String toInsert(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		demorun.debug("我是Demo0105Controller001中的toInsert方法");
		return "";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String toDelete(@RequestBody int id) {
		demorun.debug("我是Demo0105Controller001中的toDelete方法");
		return "";
	}

	@RequestMapping("/change")
	@ResponseBody
	public String toChange(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		demorun.debug("我是Demo0105Controller001中的toChange方法");
		return "";
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public String toGetOneById(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		demorun.debug("我是Demo0105Controller001中的toGetOneById方法");
		return "";
	}

	@RequestMapping("/query")
	@ResponseBody
	public String toQuery(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		demorun.debug("我是Demo0105Controller001中的toQuery方法");
		return "";
	}
}
