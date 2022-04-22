package com.jokereven.mybatisplus.api.service.impl;

import com.jokereven.mybatisplus.api.entity.User;
import com.jokereven.mybatisplus.api.mapper.UserMapper;
import com.jokereven.mybatisplus.api.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author jokereven
 * @since 2022-04-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
