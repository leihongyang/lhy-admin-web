package com.lhy.ssm.test;

import com.lhy.ssm.to.Goods;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lhy.ssm.mapper.GoodsDao;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		GoodsDao goodsDao =  (GoodsDao) context.getBean("goodsDao");
		Goods goods = goodsDao.getGoodByPrimaryKey(1000);
		System.out.println(goods);
		
		
	}

}
