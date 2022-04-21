package com.cenyol.mybatisplus.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cenyol.mybatisplus.common.controller.CurdController;
import com.cenyol.mybatisplus.api.entity.User;

/**
 * <p>
 * 用户信息 控制器
 * </p>
 *
 * @author Cenyol
 * @since 2022-04-21
*/
@RestController
@RequestMapping("/api/user")
public class UserController extends CurdController<User> {

}
