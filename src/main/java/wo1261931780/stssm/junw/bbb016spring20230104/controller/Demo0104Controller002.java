package wo1261931780.stssm.junw.bbb016spring20230104.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @author junw
 */
@Controller
@Slf4j
public class Demo0104Controller002 {
	@RequestMapping("/Demo0104Controller002/delete")
	@ResponseBody
	public String delete() {
		log.debug("我是Demo0104Controller002中的delete方法");
		return "delete";
	}
}
