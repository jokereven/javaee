package pers.jokereven.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pers.jokereven.dao.AddressMapper;
import pers.jokereven.entity.Address;
import pers.jokereven.utils.MybatisUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressMapperTest {
    //创建Logger对象
    private final Logger log = Logger.getLogger(AddressMapper.class);

    @Test
    public void testAddressCount() {
        //        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            int num = sqlSession.selectOne("pers.jokereven.javaee.dao.AddressMapper.count");
            log.debug("num ===" + " " + num);
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    //    模糊查询通过 addressDesc 差address 对象
    @Test
    public void GetAddressByAddressesDesc(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<Address> address = sqlSession.getMapper(AddressMapper.class).GetAddressByAddressesDesc("北京");
            for (Address add : address) {
//                log.debug(user.toString());
                System.out.println(add);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    //    模糊查询通过user差user
    @Test
    public void GetAddressByMap(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Map<String,String> map = new HashMap<>();
            map.put("addressDesc","北京");
            map.put("contact","王丽");
            List<Address> add = sqlSession.getMapper(AddressMapper.class).GetAddressByMap(map);
            for (Address address : add) {
//                log.debug(user.toString());
                System.out.println(address);
            }
        } finally {
            //        关闭SqlSession
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    //    增  插入 address
    @Test
    public void testAdd(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Address a=new Address();
            a.setContact("jokereven");
            a.setAddressDesc("china, wuhan");
            a.setPostCode("433200");
            a.setTel("110");
            a.setCreatedBy(1);
            a.setCreationDate(new Date());
            a.setUserId(4);
            int i = sqlSession.getMapper(AddressMapper.class).add(a);
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

    // 该 修改密码
    @Test
    public void testUpdateAddressById(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            int i = sqlSession.getMapper(AddressMapper.class).updateAddressById(4,"123456");
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

    // 删 根据id删除
    @Test
    public void deleteAddressById(){
//        创建SqlSession对象
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            int i = sqlSession.getMapper(AddressMapper.class).deleteAddressById(4);
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

    @Test
    public void TestGeAddressListByDynamic() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            List<Address> a = sqlSession.getMapper(AddressMapper.class).GeAddressListByDynamic("王丽","100010");
            for (Address address : a){
                log.debug(address.toString());
            }
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }
}
