package pers.jokereven.aop.service;

import pers.jokereven.aop.dao.UserDao;
import pers.jokereven.aop.entity.User;

public class UserServiceImpl implements UserService{

    //创建dao层对象,对数据库操作的结果进行调用
    //使用Spring注入到IOC容器中
    private UserDao dao;

    //提供set方法,用于注入
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void register(User user) {
        //调用dao里面的添加
        dao.save(user);
    }
}