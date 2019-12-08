package com.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public interface UserService {

  String getNickName(Long id);

}
