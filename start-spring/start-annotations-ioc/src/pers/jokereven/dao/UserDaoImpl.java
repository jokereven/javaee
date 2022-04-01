package pers.jokereven.dao;

import pers.jokereven.entity.User;

public class UserDaoImpl implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("添加用户成功");
    }
}
