package com.he.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2023-01-02 15:28:59
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

