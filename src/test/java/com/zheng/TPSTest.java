/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: TPSTest.java 
 * @Prject: zhangzheng-week2
 * @Package: com.zheng 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月27日 上午9:26:32 
 * @version: V1.0   
 */
package com.zheng;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.zhangzheng.common.utils.DateUtil;
import com.zhangzheng.common.utils.RandNumUtil;
import com.zhangzheng.common.utils.TPS;
import com.zhangzheng.common.utils.ZHStringUtil;

/** 
 * @ClassName: TPSTest 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月27日 上午9:26:32  
 */
public class TPSTest {

	@Test
	public void test() throws ParseException {
		BigInteger j = BigInteger.valueOf(0);
		int s=1;
		for(int i=0;i<100;i++){
			//id从1开始递增
			TPS t= new TPS();
			BigInteger b=BigInteger.valueOf(s++);
			BigInteger c=j.add(b);
			t.setId(c);
			//专家姓名属性值调用ZHStringUtil的getZHName()
			t.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建
			t.setAge(RandNumUtil.random(1, 100));
			double value = RandNumUtil.getValue(30000, 80000,2);
			//薪酬是3万到8万，小数点后2位的随机数
			BigDecimal b1=BigDecimal.valueOf(value);
			t.setMoney(b1);
			//聘用日期属性值模拟2012年1月1日至今任意随机时间
			SimpleDateFormat smt=new SimpleDateFormat("yyyy-MM-dd");
			Date parse = smt.parse("2012-1-1");
			Date random = DateUtil.random(parse,new Date() );
			t.setDate(random);
			//循环创建对象(5分)
			//控制台显示效果(5分)
			System.out.println(t);
		}
	}

}
