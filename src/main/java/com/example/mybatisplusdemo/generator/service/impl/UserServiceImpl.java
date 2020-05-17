package com.example.mybatisplusdemo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo.generator.entity.User;
import com.example.mybatisplusdemo.generator.mapper.UserMapper;
import com.example.mybatisplusdemo.generator.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author daiwenxiang
 * @since 2020-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
