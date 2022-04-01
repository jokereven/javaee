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

    //创建dao层对象,对数据库操作的结果进行调用
    //使用Spring注入到IOC容器中
//    @Autowired
    private UserDao dao;

    //提供set方法,用于注入
    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void register(User user) {
        //调用dao里面的添加
        dao.save(user);
    }
}
