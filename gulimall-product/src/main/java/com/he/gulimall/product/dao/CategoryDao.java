package com.he.gulimall.product.dao;

import com.he.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-27 08:40:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
