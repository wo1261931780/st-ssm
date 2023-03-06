package wo1261931780.stssm.junw.bbb001spring20220730.service.impl;


import wo1261931780.stssm.junw.bbb001spring20220730.dao.DemoDao2;
import wo1261931780.stssm.junw.bbb001spring20220730.dao.impl.DemoDao2Impl;
import wo1261931780.stssm.junw.bbb001spring20220730.service.DemoService2;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-03  星期日
 * @description
 */
public class DemoService2Impl implements DemoService2 {
	// private final DemoDao2 demoDao2 = new DemoDao2Impl();
	// 在没有配置依赖注入的时候，就是上面这种new的新增过程
	// 但是我们已经在bean中配置了properties
	// 所以直接采用下面的方法

	private DemoDao2 serviceDemoDao2;

	// 但是依赖注入也有些问题
	// 如果直接这样获取DI中注入的对象，就需要在下面新建一个set方法
	// 否则无法拿到需要的结果

	public void setServiceDemoDao2(DemoDao2Impl innerDemoDao2) {
		this.serviceDemoDao2 = innerDemoDao2;
	}


	// 整理一下过程：
	// 1.首先我在xml中配置好了IoC管理的service对象
	// 然后我的service对象，在运行类中，就省略了new对象的创建过程
	// 2.我发现我的的service对象，在创建Dao方法中，还是需要new一个对象出来
	// 3.所以我回到xml中，配置了依赖注入DI
	// 将Dao也注入到spring的容器中,这样就不需要手动创建了
	// 不过这样，我的service还是不理解
	// 4.所以需要在xml中，配置一下properties，说明我的映射对象，是上面的Dao
	// 说明完毕，把映射的Dao，用name的变量名，暴露给service使用
	// 现在基本都说明完了，只需要这里使用一下就可以了
	// 5.因为DI的特殊性，这里就新增了一个set配置方法，把xml中暴露出来的对象，映射到上面内部才可以访问的dao对象


	/**
	 *
	 */
	@Override
	public void servieShow2() {
		demorun.debug("我是service中的show2方法");
		String format = String.format("我是service中的Dao2对象：%s", serviceDemoDao2);
		demorun.debug(format);
		demorun.debug("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao2.show2();
	}
}
