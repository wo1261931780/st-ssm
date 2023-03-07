package junw555.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		// 最终一定要返回一个字符串类型的结果
		// RequestMapping就是设置一个访问的路径
		// 需要设置当前操作的返回值类型
		// ResponseBody就是将当前的结果作为一个整体直接返回到外面去
		System.out.println("我是当前的打印结果");
		return "123";
		// 直接返回会出现报错，但是出现了上面的打印结果
	}
	@RequestMapping("/save2")
	@ResponseBody
	public String save2() {
		System.out.println("我是当前的打印结果2");
		return "123";
	}
}
