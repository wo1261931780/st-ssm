package com.stssm.github.io.junw.bbb015spring20230103.service.impl;

import com.stssm.github.io.junw.bbb015spring20230103.service.UserService0103;
import org.springframework.stereotype.Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;
/**
 * @author junw
 */
@Service
public class UserService0103Impl implements UserService0103 {
	@Override
	public void save() {
		demorun.debug("我是user service中的save方法");
	}
}
