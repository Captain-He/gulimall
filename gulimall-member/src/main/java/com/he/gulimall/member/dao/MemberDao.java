package com.he.gulimall.member.dao;

import com.he.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hzc
 * @email ishezhichao@gmail.com
 * @date 2022-12-29 20:41:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
