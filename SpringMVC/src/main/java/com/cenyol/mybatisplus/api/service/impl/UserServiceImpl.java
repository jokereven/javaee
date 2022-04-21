package com.cenyol.mybatisplus.api.service.impl;

import com.cenyol.mybatisplus.api.entity.User;
import com.cenyol.mybatisplus.api.mapper.UserMapper;
import com.cenyol.mybatisplus.api.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Cenyol
 * @since 2022-04-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
