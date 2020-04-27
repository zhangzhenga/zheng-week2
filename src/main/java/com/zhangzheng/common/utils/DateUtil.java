package com.zhangzheng.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月24日 下午7:40:06
 */
public class DateUtil {
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据日期计算年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date  birthday) {
		Calendar c= Calendar.getInstance();
		int nowYear=c.get(Calendar.YEAR);
		int nowMonth=c.get(Calendar.MONTH);
		int nowDate=c.get(Calendar.DAY_OF_MONTH);
		Calendar c2=Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		if(nowYear<birthdayYear){
			throw new RuntimeException("传入日期错误");
		}
		int age=nowYear-birthdayYear;
		if(nowMonth<birthdayMonth){
			age--;
		}
		if(nowMonth ==birthdayMonth && nowDate<birthdayDate )
			 age--;
		return age;
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 根据传入的日期返回日期的月初。如传入 2020-04-24 ，返回 2020-04-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH,1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 根据传入的日期返回日期的月初。如传入 2020-04-24  ，返回 2020-04-30 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH,1);
		Date nexMonthInti=getInitMonth(c.getTime());
		c.setTime(nexMonthInti);
		c.add(Calendar.SECOND,-1);
		return c.getTime();
	}
	
	
	
	
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min 和max之间的日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}

}
