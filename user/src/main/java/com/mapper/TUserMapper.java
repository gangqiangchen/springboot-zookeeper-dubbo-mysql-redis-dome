package com.mapper;

import com.bean.TUser;
import com.bean.TUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * TUserMapper继承基类
 */
@Mapper
@Component
public interface TUserMapper extends MyBatisBaseDao<TUser, Long, TUserExample> {
}