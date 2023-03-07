package wo1261931780.stssm.junw.bbb017spring20230105.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wo1261931780.stssm.junw.bbb017spring20230105.domain.Demo0105DomainUser001;


/**
 * @author junw
 */
@Controller
@RequestMapping("/Book")
@Slf4j
public class Demo0105Controller002 {
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String toInsert(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		log.debug("我是Demo0105Controller001中的toInsert方法");
		return "";
	}

	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public String toDelete(@PathVariable int id) {
		log.debug("我是Demo0105Controller001中的toDelete方法");
		// 这里是将post变量，放入路径中进行解析
		return "";
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String toChange(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		log.debug("我是Demo0105Controller001中的toChange方法");
		return "";
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String toGetOneById(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		log.debug("我是Demo0105Controller001中的toGetOneById方法");
		return "";
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String toQuery(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		log.debug("我是Demo0105Controller001中的toQuery方法");
		return "";
	}
}
