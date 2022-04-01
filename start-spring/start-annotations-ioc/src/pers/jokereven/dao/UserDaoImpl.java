package pers.jokereven.dao;

import org.springframework.stereotype.Repository;
import pers.jokereven.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存成功");
    }
}
