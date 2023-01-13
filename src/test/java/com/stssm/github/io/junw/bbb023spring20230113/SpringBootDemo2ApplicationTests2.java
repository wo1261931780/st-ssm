package com.stssm.github.io.junw.bbb023spring20230113;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootdemo2.dao.Demo0113UserDao002;
import com.example.springbootdemo2.domain.Demo0113Domain001;
import com.example.springbootdemo2.domain.Demo0113Domain002;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootDemo2ApplicationTests2 {
	// 这里主要是讲查询投影的相关内容

	@Autowired
	private Demo0113UserDao002 demo0113UserDao002;

	@Test
	void testGetAllByConditions() {
		QueryWrapper<Demo0113Domain002> queryWrapper = new QueryWrapper<>();
		queryWrapper.select("id", "name", "age");
		// 如果不是lambda表达式
		// 这里就直接使用我们的字符串传入参数即可
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(queryWrapper);
		System.out.println(demo0113Domain001List);
	}

	@Test
	void testGetAllByLambdaConditions() {
		LambdaQueryWrapper<Demo0113Domain002> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.select(Demo0113Domain002::getId, Demo0113Domain002::getName, Demo0113Domain002::getTel);
		// 我这里相当于对对象完成了一次筛选的过程
		List<Demo0113Domain001> demo0113Domain001List = demo0113UserDao002.selectList(lambdaQueryWrapper);
		System.out.println(demo0113Domain001List);// 只是lambda的数据格式
	}

	@Test
	void testGetPageByConditions() {
		QueryWrapper<Demo0113Domain002> queryWrapper = new QueryWrapper<>();
		queryWrapper.select("count(*) as count,tel");
		// 因为这里返回得到的是一个数据类型的
		// 所以我们需要修改接收的东西
		// 因为我们这里，实际上还是使用java去完成SQL功能
		// 所以有的SQL代码，用java写起来会比较不一样
		queryWrapper.groupBy("tel");// 按照电话进行分组
		// 这里其实就是我们所说的查询统计
// 我们这里，实际上是使用mybatisPlus的接口，完成查询操作
// 但是对于一些比较难处理的SQL，我们直接回归到dao中，使用SQL语句查询即可

		List<Map<String, Object>> selectMaps = demo0113UserDao002.selectMaps(queryWrapper);
		// 这里的Map<String, Object>，就分别代表了key和value
		System.out.println(selectMaps);// 返回得到的就是map类型的格式

	}


}
