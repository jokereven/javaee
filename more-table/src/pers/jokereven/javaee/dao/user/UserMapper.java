package pers.jokereven.javaee.dao.user;

import org.apache.ibatis.annotations.Param;
import pers.jokereven.javaee.entity.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> GetUserRoleListByRoleId(@Param("userRole") Integer roleId);

//    通过user查询user信息 address
    List<User> GetUserAddressByUserId(@Param("id") Integer userId);

//    动态sql接口
    List<User> GetUserListByDynamic(@Param("userName")String userName,@Param("userRole")Integer roleId);

//  动态sql修改
    int UpdateUserByDynamicSql(User user);

//  动态多id查询
    List<User> GetUserByDynamicSqlFoEach(Integer[] roleIds);

//  foreach list
    List<User> GetUserByDynamicSqlForEachList(List<Integer> roleList);

//  foreach map
    List<User> GetUserByDynamicSqlForEachMap(Map<String,Object> roleMap);

// 多条件查询用户列表
    List<User> GetUserByMoreCondChoose(@Param("userName") String userName,
                                 @Param("userRole")Integer roleId,
                                 @Param("userCode")String userCode,
                                 @Param("creationDate")Date creationDate);
}
