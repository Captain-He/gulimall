package com.he.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-29 20:31:56
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

