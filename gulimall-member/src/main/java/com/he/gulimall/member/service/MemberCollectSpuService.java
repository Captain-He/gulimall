package com.he.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.he.common.utils.PageUtils;
import com.he.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-29 20:41:35
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

