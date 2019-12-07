package com.mapper;

import com.bean.TOrder;
import com.bean.TOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * TOrderDAO继承基类
 */
@Mapper
@Component
public interface TOrderDAO extends MyBatisBaseDao<TOrder, Long, TOrderExample> {
}