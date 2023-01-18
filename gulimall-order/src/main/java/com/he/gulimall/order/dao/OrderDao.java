package com.he.gulimall.order.dao;

import com.he.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2023-01-02 15:28:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
