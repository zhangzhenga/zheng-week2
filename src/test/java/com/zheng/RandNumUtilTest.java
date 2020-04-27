/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RandNumUtilTest.java 
 * @Prject: zhangzheng-week2
 * @Package: com.zheng 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月27日 上午9:03:47 
 * @version: V1.0   
 */
package com.zheng;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: RandNumUtilTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月27日 上午9:03:47  
 */
public class RandNumUtilTest {

	/**
	 * Test method for {@link com.zheng.RandNumUtil#getValue(double, double, int)}.
	 */
	//测试返回随机小数
	@Test
	public void testGetValue() {
		double value ;
		for (int i = 0; i < 100; i++) {
			value=RandNumUtil.getValue(2.5, 3.5, 3);
			System.out.println(value);
		}
		
	}
	//测试返回随机整数
	/**
	 * Test method for {@link com.zheng.RandNumUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		int random ;
		for(int i=0;i<100;i++){
			random=RandNumUtil.random(2, 5);
			System.out.println(random);
		}
	}

}
