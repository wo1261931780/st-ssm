package wo1261931780.stssm.junw.bbb015spring20230103.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author junw
 */
@Configuration
@ComponentScan(value = "wo1261931780.stssm.junw.bbb015spring20230103",
		excludeFilters = @ComponentScan.Filter(
				type = FilterType.ANNOTATION,
				classes = Controller.class
		)
)
public class Spring0103Configuration001 {
// @ComponentScan({"wo1261931780.stssm.junw.bbb015spring20230103.service", "wo1261931780.stssm.junw.bbb015spring20230103.dao"})
// 解释一下上面的两种类型
// 首先我设置全部扫描
// 然后发现，我存在一个controller类型的注解不需要进入我的spring管理
// 因此我需要设置一个排除规则
// 这里的排除规则，就是所谓的excludeFilters
// 因为过滤器中，筛选的对象是注解类型
// 所以我需要指定排除的是controller类
}
