package pers.jokereven.javaee;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import pers.jokereven.javaee.dao.UserMapper;
import pers.jokereven.javaee.entity.User;
import pers.jokereven.javaee.util.MybatisUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    //创建Logger对象
    private final Logger log = Logger.getLogger(UserMapperTest.class);

    // 使用junit测试
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            // 1. 读取mybatis的配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            // 2. 创建sql会话工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = builder.build(is);
            // 3. 创建sql会话对象, 调用mapper.xml的sql语句
            sqlSession = sqlSessionFactory.openSession();
            // 4. 使用sqlSession执行sql语句
            int num = sqlSession.selectOne("pers.jokereven.javaee.dao.UserMapper.count");
            log.debug("num ===" + " " + num);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接
            assert sqlSession != null;
            sqlSession.close();
        }
    }

    // 使用junit测试
    @Test
    public void testGetAll() {
        SqlSession sqlSession = null;
        try {
            // 1. 读取mybatis的配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            // 2. 创建sql会话工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = builder.build(is);
            // 3. 创建sql会话对象, 调用mapper.xml的sql语句
            sqlSession = sqlSessionFactory.openSession();
            // 4. 使用sqlSession执行sql语句
            List<User> users = sqlSession.getMapper(UserMapper.class).getAll();
            for (User user : users) {
                log.debug(user.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接
            assert sqlSession != null;
            sqlSession.close();
        }
    }

    //    使用封装的SqlSession对象进行Test
    @Test
    public void testUtilGetAll() {
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> users = sqlSession.getMapper(UserMapper.class).getAll();
            for (User user : users) {
                log.debug(user.toString());
                System.out.println(user);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

//  模糊查询
    @Test
    public void testGetUserByUserName(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<User> users = sqlSession.getMapper(UserMapper.class).GetUserByUserName("张");
            for (User user : users) {
//                log.debug(user.toString());
                System.out.println(user);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

//    模糊查询通过user差user
    @Test
    public void GetUserByUserObject(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            User u = new User();
            u.setUserName("张");
            u.setUserRole(3);
            List<User> users = sqlSession.getMapper(UserMapper.class).GetUserByUserObject(u);
            for (User user : users) {
//                log.debug(user.toString());
                System.out.println(user);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    //    模糊查询通过user差user map
    @Test
    public void GetUserByMap(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Map<String,String> map = new HashMap<>();
            map.put("uName","张");
            map.put("uRole","3");
            List<User> users = sqlSession.getMapper(UserMapper.class).GetUserByMap(map);
            for (User user : users) {
//                log.debug(user.toString());
                System.out.println(user);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    //    插入数据
    @Test
    public void testAdd(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            User u=new User();
            u.setUserCode("jokereven");
            u.setUserName("JOKEREVEN");
            u.setUserPassword("root");
            u.setUserRole(1);
            u.setGender(1);
            u.setBirthday(new Date());
            u.setPhone("1234567890");
            u.setAddress("关山大道");
            u.setCreatedBy(1);
            u.setCreationDate(new Date());
            int i = sqlSession.getMapper(UserMapper.class).add(u);
            //手动挺交事务
            sqlSession.commit();
            System.out.println(i == 0?"失败":"成功");
        }catch (Exception e){
            e.printStackTrace();
//            出现问题, 进行数据回滚
            assert sqlSession != null;
            sqlSession.rollback();
        }
        finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    // 修改
    @Test
    public void testModify(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            User u=new User();
            u.setId(40);
            u.setUserCode("joker");
            u.setUserName("JOKER");
            u.setUserPassword("123456");
            u.setUserRole(2);
            u.setGender(3);
            u.setBirthday(new Date());
            u.setPhone("1234567890");
            u.setAddress("关山大道");
            u.setCreatedBy(1);
            u.setCreationDate(new Date());
            int i = sqlSession.getMapper(UserMapper.class).modify(u);
            //手动挺交事务
            sqlSession.commit();
            System.out.println(i == 0?"失败":"成功");
        }catch (Exception e){
            e.printStackTrace();
//            出现问题, 进行数据回滚
            assert sqlSession != null;
            sqlSession.rollback();
        }
        finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    // 修改密码
    @Test
    public void testUpdatePwd(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            int i = sqlSession.getMapper(UserMapper.class).updatePwd(40,"joker@717");
            //手动挺交事务
            sqlSession.commit();
            System.out.println(i == 0?"失败":"成功");
        }catch (Exception e){
            e.printStackTrace();
//            出现问题, 进行数据回滚
            assert sqlSession != null;
            sqlSession.rollback();
        }
        finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    // 根据id删除
    @Test
    public void testDeleteUserById(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            int i = sqlSession.getMapper(UserMapper.class).deleteUserById(40);
            //手动挺交事务
            sqlSession.commit();
            System.out.println(i == 0?"失败":"成功");
        }catch (Exception e){
            e.printStackTrace();
//            出现问题, 进行数据回滚
            assert sqlSession != null;
            sqlSession.rollback();
        }
        finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }
}
