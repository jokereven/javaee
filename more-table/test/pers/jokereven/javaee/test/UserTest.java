package pers.jokereven.javaee.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pers.jokereven.javaee.dao.user.UserMapper;
import pers.jokereven.javaee.entity.Address;
import pers.jokereven.javaee.entity.User;
import pers.jokereven.javaee.utils.MybatisUtil;

import java.util.*;

public class UserTest {
    //创建Logger对象
    private final Logger log = Logger.getLogger(UserTest.class);

    @Test
    public void TestGetUserRoleListByRoleId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserRoleListByRoleId(3);
            for (User user : u){
                log.debug(user.toString() + "\\" + user.getRole().toString());
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void TestGetUserAddressByUserId() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserAddressByUserId(1);
            for (User user : u){
                log.debug(user.toString());
                for (Address address : user.getAddressList()){
                    log.debug(address.toString());
                }
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void TestGetUserListByDynamic() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserListByDynamic("李明",2);
            for (User user : u){
                log.debug(user.toString());
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void TestUpdateUserByDynamicSql() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            User u=new User();
            u.setId(2);
            u.setUserName("jokereven");
            int i = sqlSession.getMapper(UserMapper.class).UpdateUserByDynamicSql(u);
            //手动挺交事务
            sqlSession.commit();
            System.out.println(i == 0?"失败":"成功");
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void TestGetUserByDynamicSqlFoEach() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Integer[] arr = {1,2,3};
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            Map<String, Object> map = new HashMap<>();
            map.put("roleIds",list);
            map.put("gender",2);
//            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserByDynamicSqlFoEach(arr);
//            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserByDynamicSqlForEachList(list);
            List<User> u = sqlSession.getMapper(UserMapper.class).GetUserByDynamicSqlForEachMap(map);

            for (User user : u){
//                log.debug(user.toString());
                System.out.println(user.toString());
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void TestGetUserByMoreCondChoose() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> users = sqlSession.getMapper(UserMapper.class).GetUserByMoreCondChoose("jokereven",null,null,null);
            for (User user : users){
//                log.debug(user.toString());
                System.out.println(user.toString());
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }
}
