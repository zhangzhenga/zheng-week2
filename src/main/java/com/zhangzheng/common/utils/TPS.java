/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: TPS.java 
 * @Prject: zhangzheng-week2
 * @Package: com.zheng 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年4月27日 上午8:43:43 
 * @version: V1.0   
 */
package com.zhangzheng.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: TPS 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年4月27日 上午8:43:43  
 */
public class TPS {
	private BigInteger id;
	private String name;
	private Integer age;
	private Date date;
	private BigDecimal money;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public TPS(BigInteger id, String name, Integer age, Date date,
			BigDecimal money) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.date = date;
		this.money = money;
	}
	public TPS() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		SimpleDateFormat smt=new SimpleDateFormat("yyyy-MM-dd");
		String format = smt.format(date);
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", date="
				+ format + ", money=" + money + "]";
	}
	
	
	
}
