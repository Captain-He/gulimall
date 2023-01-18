package com.he.gulimall.order.dao;

import com.he.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2023-01-02 15:28:59
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
