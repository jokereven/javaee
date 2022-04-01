package pers.jokereven.aop.dao;

import pers.jokereven.aop.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        //编写sql语句,对数据库进行操作,得到结果(成功或者失败)
        System.out.println("添加到数据库中成功！！！！！！");
    }
}
