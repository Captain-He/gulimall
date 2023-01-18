package com.he.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2023-01-02 15:28:59
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

