package com.stssm.github.io.junw.bbb023spring20230113;

import com.stssm.github.io.junw.bbb023spring20230113.dao.Demo0113UserDao003;
import com.stssm.github.io.junw.bbb023spring20230113.domain.Demo0113Domain005;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringBootDemo2ApplicationTests6 {

	@Autowired
	private Demo0113UserDao003 demo0113UserDao003;

	@Test
	void testDeleteById(int id) {
		demo0113UserDao003.deleteById(id);
		// 如果有逻辑删除字段，那么我们不会物理删除，只会修改逻辑字段
		// 相当于，不影响业务
	}

	@Test
	void testSelectAll() {
		List<Demo0113Domain005> demo0113Domain005List = demo0113UserDao003.selectList(null);
		System.out.println(demo0113Domain005List);
		// 这里也体现了mybatisPlus的强大之处
		// 我不需要设置多余的条件，只要有逻辑删除的字段存在
		// 那么我就只会查询出逻辑删除的字段
		// mybatisPlus的SQL字段中，默认会设置delete=0
	}

	@Test
	void testVersionController() {
		Demo0113Domain005 demo0113Domain005 = new Demo0113Domain005();
		demo0113Domain005.setName("11");
		demo0113Domain005.setAge(11);
		demo0113Domain005.setVersion(1);// 设置乐观锁
		demo0113UserDao003.updateById(demo0113Domain005);// 乐观锁是在更新的操作下完成的
		// 我们这里更新，不一定要version为多少
		// 但是一定要有一个version值存在，否则version=version+1是不会进入拦截器的
	}

	@Test
	void testVersionController2() {
		Demo0113Domain005 demo0113Domain005 = new Demo0113Domain005();
		demo0113Domain005.setName("123");
		demo0113Domain005.setVersion(1);// 设置乐观锁
		Demo0113Domain005 demo0113Domain0051 = new Demo0113Domain005();
		demo0113Domain0051.setName("333");
		demo0113Domain0051.setVersion(1);// 设置乐观锁
		demo0113UserDao003.updateById(demo0113Domain005);
		demo0113UserDao003.updateById(demo0113Domain0051);
		// 这里更新两个对象，同时存在version的数据
		// 那么具体只会执行一条，其余的数据是暂时不更新的
		// 其实就是做了事物控制，两个事物之间是互斥的
	}
}
