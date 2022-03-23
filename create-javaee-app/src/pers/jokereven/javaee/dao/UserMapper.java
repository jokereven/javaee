package pers.jokereven.javaee.dao;

import org.apache.ibatis.annotations.Param;
import pers.jokereven.javaee.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询所有 方法名和映射文件mapper.xml里面的id一模一样
    int count();

    List<User> getAll();

//  模糊查询
//   by username
    List<User> GetUserByUserName(String userName);

//   by user object
    List<User> GetUserByUserObject(User user);

//  by Map
    List<User> GetUserByMap(Map<String,String> userMap);

//  添加 user
    int add(User user);

//  修改 user 信息
    int modify(User user);

//  根据 user id 修该密码
//  映射数据表中的字段
    int updatePwd(@Param("id") Integer id,@Param("userPassword") String pwd);

//    根据id删除
    int deleteUserById(@Param("id") Integer delId);
}
