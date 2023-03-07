package wo1261931780.stssm.junw.bbb008spring20220807.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-09-16  星期六
 * @description
 */
@Configuration
@Import({wo1261931780.stssm.junw.bbb008spring20220807.config.Jdbc0807Configuration002.class})
public class Spring0807Configuration003 {
	// 包扫描器@ComponentScan({"com.stssm.github.io"})不太直观地看出到底管理了哪些内容
	// 我们可以直接在上面使用Import包导入的方式，来添加我们需要管理的内容
	// 如果要添加多个，就直接使用数组的形式来添加
	// 但是，包扫描器和导入，只能选择一个保留
	// 对于Import进来的参数对象
	// 参数对象Jdbc0807Configuration002，就不能设置Configuration，否则报错

	// ============================================
	// 比较合适的理解是：
	// 参数只能存在一个
	// 导入的对象，只能作为一个工厂类型的配置类
	// 真实的配置类，是这里的003
}
