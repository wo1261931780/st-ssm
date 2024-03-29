package wo1261931780.stssm.junw.bbb016spring20230104.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wo1261931780.stssm.junw.bbb016spring20230104.domain.Demo0104DomainUser;

import java.util.Arrays;
import java.util.List;


/**
 * @author junw
 */
@Controller
@Slf4j
@RequestMapping("/Demo0104Controller005")
public class Demo0104Controller005 {
	@RequestMapping("/getParams")
	@ResponseBody
	public String getParams(@RequestParam("name") String demoName, @RequestParam("age") String demoAge, @RequestParam("address") String demoAddress) {
		log.debug("我是Demo0104Controller005中的getParams方法");
		// 这里主要演示，在名称不同的情况下，如何完成配置
		// 直接通过设置注解，来完成变量名称的转换
		log.debug("我是参数1：" + demoName);
		log.debug("我是参数2：" + demoAge);
		log.debug("我是参数3：" + demoAddress);
		return "getParams";
	}

	@RequestMapping("/getPojoParam")
	@ResponseBody
	public String getPojParams(Demo0104DomainUser demo0104DomainUser) {
		log.debug("我是Demo0104Controller005中的getPojoParams方法");
		log.debug("我是实体类中获取的对象参数1：" + demo0104DomainUser.getName());
		log.debug("我是实体类中获取的对象参数2：" + demo0104DomainUser.getAge());
		log.debug("我是实体类中获取的对象：" + demo0104DomainUser);
		return demo0104DomainUser.toString();
	}

	@RequestMapping("/getHabits")
	@ResponseBody
	public String getHabits(String[] habits) {
		log.debug("我是实体类中获取的兴趣列表：" + Arrays.toString(habits));
		// 返回一个数组类型的，直接传入相同的参数就可以实现
		// 传递数组，本质就是传递一个pojo对象
		// 具体的参数，直接在pojo中set进去就可以
		return "返回成功";
	}

	@RequestMapping("/getListHabits")
	@ResponseBody
	public String getListHabits(@RequestParam List<String> listHabits) {
		// 如果不添加RequestParam，会导致报错
		log.debug("我是实体类中获取的list兴趣列表" + listHabits);
		return "list类型的结果返回成功";
	}
}
