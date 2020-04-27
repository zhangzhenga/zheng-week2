/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: ZHStringUtilTest.java 
 * @Prject: zhangzheng-week2
 * @Package: com.zheng 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月27日 上午9:17:46 
 * @version: V1.0   
 */
package com.zheng;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zhangzheng.common.utils.ZHStringUtil;

/**
 * @ClassName: ZHStringUtilTest
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月27日 上午9:17:46
 */
public class ZHStringUtilTest {

	/**
	 * Test method for {@link com.zhangzheng.common.utils.ZHStringUtil#getZHString(int)}.
	 */
	@Test
	public void testGetZHString() {
		
			String zhString = ZHStringUtil.getZHString(12);
			System.out.println(zhString);
		
	}

	/**
	 * Test method for {@link com.zhangzheng.common.utils.ZHStringUtil#getZHName()}.
	 */
	@Test
	public void testGetZHName() {
		for(int i=0;i<100;i++){
			String zhName = ZHStringUtil.getZHName();
			System.out.println(zhName);
		}
	}

}
