package wo1261931780.stssm.junw.bbb018spring20230106.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.stssm.junw.bbb018spring20230106.domain.Demo0106DomainUser001;


/**
 * @author junw
 */
@RestController
@RequestMapping("/Users")
@Slf4j
public class Demo0106Controller002 {
	// 在类上面添加@ResponseBody以后
	// 下面的具体方法中，就不需要重复添加
	// 同时，因为这里使用的是rest风格来访问资源
	// 所以干脆将Controller和ResponseBody其合为一个@RestController


	@RequestMapping(method = RequestMethod.POST)
	public String toSave(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		log.debug("" + demo0106DomainUser001);
		return "toSave 方法执行";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String toDelete(@PathVariable int id) {
		log.debug("" + id);
		return "toDelete 方法执行";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String toUpdate(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		log.debug("" + demo0106DomainUser001);
		return "toUpdate 方法执行";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String toGetById(@PathVariable int id) {
		log.debug("" + id);
		return "toGetById 方法执行";
	}
}
