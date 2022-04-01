package pers.jokereven.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jokereven.entity.User;
import pers.jokereven.service.UserService;

public class UserTest {
    //创建spring上下文对象
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //获取Spring容器中的service对象
    UserService uService = (UserService) context.getBean("service");

    //创建用于注册的用户对象
    User user = new User();
}
