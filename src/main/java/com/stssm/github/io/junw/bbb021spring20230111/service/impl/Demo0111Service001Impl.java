package com.stssm.github.io.junw.bbb021spring20230111.service.impl;

import com.stssm.github.io.junw.bbb021spring20230111.service.Demo0111Service001;
import org.springframework.stereotype.Service;
/**
 * @author junw
 */
@Service
public class Demo0111Service001Impl implements Demo0111Service001 {
	@Override
	public void serviceShow() {
		System.out.println("demo001中的show方法被调用");
	}
}
