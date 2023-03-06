package wo1261931780.junw.bbb023spring20230113;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stssm.github.io.junw.bbb023spring20230113.dao.Demo0113UserDao002;
import com.stssm.github.io.junw.bbb023spring20230113.domain.Demo0113Domain001;
import com.stssm.github.io.junw.bbb023spring20230113.domain.query.Demo0113Domain002Query;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDemo2ApplicationTests {

	@Autowired
	private Demo0113UserDao002 demo0113UserDao002;

	@Test
	void testGetAll() {
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(null);
		System.out.println(demo0113Domain001List);
	}

	/**
	 * 按条件查询的操作
	 */
	@Test
	void testGetAllByConditions() {
		QueryWrapper wrapper = new QueryWrapper<>();// 条件体
		wrapper.lt("age", 11);// 条件查询的方法
		// lt就是less than，小于设置的条件
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(wrapper);
		System.out.println(demo0113Domain001List);
	}

	/**
	 * 使用lambda表达式，按条件查询的操作
	 */
	@Test
	void testGetAllByLambdaConditions() {
		QueryWrapper<Demo0113Domain001> wrapper = new QueryWrapper<>();// 条件体
		// 使用lambda表达式，需要注意两点
		// 首先是这里需要指定我们的domain类型
		wrapper.lambda().lt(Demo0113Domain001::getAge, 11);// 使用lambda表达式完成筛选
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(wrapper);
		System.out.println(demo0113Domain001List);
	}

	/**
	 * 使用lambda表达式，但是查询更加简化了
	 */
	@Test
	void testGetAllByLambdaConditions2() {
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// lambdaQueryWrapper.lt(Demo0113Domain001::getAge, 11); // 其实还是使用了lambda表达式
		// lambdaQueryWrapper.lt(Demo0113Domain001::getAge, 11).gt(Demo0113Domain001::getAge, 10);
		// 这里就是链式编程
		// 直接设置多条件查询，同时设定最大最小值
		lambdaQueryWrapper.lt(Demo0113Domain001::getAge, 11).or().gt(Demo0113Domain001::getAge, 10);
		// 上面这一条，就是添加了或者连接符
		// 大于xx或者小于xx
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		System.out.println(demo0113Domain001List);
	}

	@Test
	void domainQueryByAge() {
		Demo0113Domain002Query demo0113Domain002Query = new Demo0113Domain002Query();
		demo0113Domain002Query.setAge(10);// 如果任意上限和下限没有设置，那么直接传递进去，只会得到null
		// 最终导致查询失败
		demo0113Domain002Query.setAgeGt(20);
		// 使用这个对象，同时设置最大最小值
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.lt(Demo0113Domain001::getAge, demo0113Domain002Query.getAgeGt()).gt(Demo0113Domain001::getAge, demo0113Domain002Query.getAgeGt());
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		System.out.println(demo0113Domain001List);
	}

	@Test
	void domainQueryByAge2() {
		Demo0113Domain002Query demo0113Domain002Query = new Demo0113Domain002Query();
		// 这里换了一种更加健壮的代码写法
		LambdaQueryWrapper<Demo0113Domain001> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		// lambdaQueryWrapper.lt(Demo0113Domain001::getAge, demo0113Domain002Query.getAge2()).gt(Demo0113Domain001::getAge, demo0113Domain002Query.getAge2());
		// 为了避免进行判空处理
		// 这里需要手动修改，相当于手动设置了一个三元运算符
		lambdaQueryWrapper.lt(null != demo0113Domain002Query.getAge(), Demo0113Domain001::getAge, null);
		lambdaQueryWrapper.gt(null != demo0113Domain002Query.getAgeGt(), Demo0113Domain001::getAge, null);
		// 不管是大于海慧寺小于，这里返回的都是domain中的getage对象
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		System.out.println(demo0113Domain001List);
	}
	// 查询出来的有多少个字段，我们将其称为查询投影

	@Test
	void deleteById() {
		demo0113UserDao002.deleteById(1);
		System.out.println("执行完毕");
	}

	@Test
	void updateById() {
		// demo0113UserDao002.updateById(1);
		// 这里update操作，如果是mybatis，就需要手动设置其他数据是否为空
		// 但是对于mybatis-plus来说，只要设置一个字段，其他字段不会变动
		System.out.println("执行完毕");
	}

	@Test
	void getByPage() {
		// 其实mybatisPlus本质上是对SQL进行了增强操作
		// 所以这里我们进行的分页操作，实际需要进行一遍增强
		IPage page = new Page(1, 20);
		// 1表示第几页
		// 20表示当前页有多少数据
		IPage iPage = demo0113UserDao002.selectPage(page, null);
		System.out.println("执行完毕");
		System.out.println("当前是第几页：" + page.getCurrent());
		System.out.println("每一页显示数：" + page.getSize());
		System.out.println("一共多少页：" + page.getPages());
		System.out.println("一共多少条记录：" + page.getTotal());
		System.out.println("当前页的所有数据：" + page.getRecords());
	}

}
