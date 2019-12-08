package com.service.impl;

import com.bean.TUser;
import com.mapper.TUserMapper;
import com.service.UserService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  TUserMapper tUserMapper;

  @Override
  public String getNickName(Long id) {
    TUser tUser = tUserMapper.selectByPrimaryKey(id);
    return tUser.getUsername();
  }
}
