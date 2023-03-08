package wo1261931780.junw.bbb023spring20230113;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.stssm.junw.bbb023spring20230113.dao.Demo0113UserDao002;
import wo1261931780.stssm.junw.bbb023spring20230113.domain.Demo0113Domain001;

import java.util.List;

@SpringBootTest
class SpringBootDemo2ApplicationTests3 {

	@Autowired
	private Demo0113UserDao002 demo0113UserDao002;

	@Test
	void testGetOneByLambdaConditions() {
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// 设置登录条件，字符串是否相等之类
		lambdaQueryWrapper.eq(Demo0113Domain001::getName, "11").eq(Demo0113Domain001::getPassword, "22");
		// List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		// 我们如果真的去做登录操作，那么这里只需要做一个这样的操作就可以了
		// 这里有查询一条数据的api
		Demo0113Domain001 demo0113Domain001 = demo0113UserDao002.selectOne(lambdaQueryWrapper);
		// 对于实际的业务，这里就需要手动设置一个MD5加密的过程
		System.out.println(demo0113Domain001);
	}

	@Test
	void testGetAllByLambdaConditions() {
		// 这里就是范围查询的过程
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// 范围查询，这里可以分为带有等号和不带有等号的
		// 小于号分别是lt le
		// 大于号分别是gt ge
		// 除此以外，还有between
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper1 = lambdaQueryWrapper.between(Demo0113Domain001::getAge, 10, 20);
		// 先属性，然后设置大小范围
		// 这里的大小属性是又先后顺序的，但是先后顺序颠倒，也不会报错，只是返回结果为空
		System.out.println(lambdaQueryWrapper1);
	}

	@Test
	void testGetAllByLambdaConditionsLike() {
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// lambdaQueryWrapper.likeRight(Demo0113Domain001::getName, "demo");
		// likeRight就是：%+demo
		// lambdaQueryWrapper.likeLeft(Demo0113Domain001::getName, "demo");
		// likeLeft就是：demo+%
		// 这里实际上就是SQL中的左右查询
		lambdaQueryWrapper.like(Demo0113Domain001::getName, "demo");// 注意一下，这里实际上都是在设置条件
		// 也是因为，返回的对象都是同一个类型，所以我们可以进行链式编程
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		System.out.println(demo0113Domain001List);
	}
}
