package com.he.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2023-01-02 15:31:14
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

