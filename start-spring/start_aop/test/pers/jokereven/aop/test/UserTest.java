package pers.jokereven.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jokereven.aop.entity.User;
import pers.jokereven.aop.service.UserService;

public class UserTest {

    @Test
    public void test(){
        //创建spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Spring容器中的service对象
        UserService uService = (UserService) context.getBean("uService");

        //创建用于注册的用户对象
        User user = new User();
        user.setId(1);
        user.setUserName("jokereven");
        user.setPassword("123456");

        //执行注册方法
        uService.register(user);

    }
}