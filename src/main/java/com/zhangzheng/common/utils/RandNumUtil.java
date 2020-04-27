/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: RandNumUtil.java 
 * @Prject: zhangzheng-week2
 * @Package: com.zheng 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月27日 上午8:46:08 
 * @version: V1.0   
 */
package com.zhangzheng.common.utils;

import java.math.BigDecimal;
import java.util.Random;

/** 
 * @ClassName: 随机数工具类
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月27日 上午8:46:08  
 */
public class RandNumUtil {
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		BigDecimal c=new BigDecimal(Math.random()*(max-min)+min);
		BigDecimal setScale = c.setScale(scale,BigDecimal.ROUND_HALF_UP);
		double doubleValue = setScale.doubleValue();
		return doubleValue;
	//TODO 实现代码
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		Random r=new Random();
		int nextInt = r.nextInt(max-min+1)+min;
		return nextInt;
	//TODO 实现代码
	} 

}
