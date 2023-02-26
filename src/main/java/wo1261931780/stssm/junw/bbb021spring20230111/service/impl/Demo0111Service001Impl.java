package com.stssm.github.io.junw.bbb021spring20230111.service.impl;

import com.stssm.github.io.junw.bbb021spring20230111.service.Demo0111Service001;
import org.springframework.stereotype.Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Service
public class Demo0111Service001Impl implements Demo0111Service001 {
	@Override
	public void serviceShow() {
		demorun.debug("demo001中的show方法被调用");
	}
}
