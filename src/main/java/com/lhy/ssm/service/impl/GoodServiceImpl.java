package com.lhy.ssm.service.impl;

import com.lhy.ssm.to.Goods;
import com.lhy.ssm.service.GoodsService;
import com.lhy.ssm.mapper.GoodsDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("GoodsService")
public class GoodServiceImpl implements GoodsService {

	@Resource
	private GoodsDao goodsDao;

	@Override
	public Goods getGood(long goodId) {
		Goods goods = goodsDao.getGoodByPrimaryKey(goodId);
		return goods;
	}

}
