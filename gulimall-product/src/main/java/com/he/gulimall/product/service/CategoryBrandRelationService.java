package com.he.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-27 08:40:12
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

