package pers.jokereven.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// 创建SqlSession对象和关闭SqlSession对象的工具类
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    //    1. 创建会话工厂
    static {
        System.out.println("static Factory");
        try {
            // 1. 读取mybatis的配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            // 2. 创建sql会话工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("build the SqlSessionFactory Filed");
        }
    }

    //    2. 创建SqlSession
    public static SqlSession createSqlSession() {
//        通过方法的返回值, 得到会话对象
//        default true 自动提交事务处理 false 手动提交事务处理
        return sqlSessionFactory.openSession(false);
    }

    //    3. 关闭SqlSession
    public static void closeSqlSession(SqlSession sqlSession) {
//        判断sqlSession是否为空
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
