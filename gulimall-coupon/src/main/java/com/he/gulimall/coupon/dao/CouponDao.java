package com.he.gulimall.coupon.dao;

import com.he.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-29 20:31:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
