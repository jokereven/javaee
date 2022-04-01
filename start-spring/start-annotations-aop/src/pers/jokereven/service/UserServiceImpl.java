package pers.jokereven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jokereven.dao.UserDao;
import pers.jokereven.entity.User;

// @Component 用来实现bean组件的注解定义(entity 包下面)
// @Repository 实现dao层下面的组件
// @Service 实现service业务逻辑
// @Controller 实现控制器组件(controller and servlet)

@Service("service")
public class UserServiceImpl implements UserService{
//    创建Dao对象

    @Autowired
    private UserDao dao;

/*    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }*/

    @Override
    public void AddUser(User user) {
        dao.save(user);
    }
}
