package com.jokereven.mybatisplus.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jokereven.mybatisplus.common.controller.CurdController;
import com.jokereven.mybatisplus.api.entity.User;

/**
 * <p>
 * 用户信息 控制器
 * </p>
 *
 * @author jokereven
 * @since 2022-04-22
*/
@RestController
@RequestMapping("/api/user")
public class UserController extends CurdController<User> {

}
