package com.lhy.ssm.mapper;

import com.lhy.ssm.to.Goods;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao {

	Goods getGoodByPrimaryKey(long goodId);
	
}
