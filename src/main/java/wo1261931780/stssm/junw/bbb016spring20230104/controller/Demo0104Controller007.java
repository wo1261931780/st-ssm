package wo1261931780.stssm.junw.bbb016spring20230104.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * @author junw
 */
@Controller
@Slf4j
@RequestMapping("/Demo0105Controller002")
public class Demo0104Controller007 {
	@RequestMapping("/getDateParams")
	@ResponseBody
	public String getDateParams(@RequestParam Date demoDate,
	                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date demoDate2,
	                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date demoDate3) {
		log.debug("我是实体类Demo0105Controller002中getDateParams获取的数据1:" + demoDate);
		// Thu Jan 05 00:00:00 CST 2023
		// 日期类型的数据被接收后，返回的是一个date类型的对象
		log.debug("我是实体类Demo0105Controller002中getDateParams获取的数据2:" + demoDate2);
		log.debug("我是实体类Demo0105Controller002中getDateParams获取的数据3:" + demoDate3);
		return "date类型的数据返回成功";
	}
}
