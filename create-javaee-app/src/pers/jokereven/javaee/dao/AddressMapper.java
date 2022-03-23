package pers.jokereven.javaee.dao;

import org.apache.ibatis.annotations.Param;
import pers.jokereven.javaee.entity.Address;

import java.util.List;
import java.util.Map;

public interface AddressMapper {
//  查询地址表条数数
    int count();

    //  模糊查询
//   by address
    List<Address> GetAddressByAddressesDesc(String AddressDesc);

    //  by Map
    List<Address> GetAddressByMap(Map<String,String> AddressMap);

    //  添加 user
    int add(Address address);

    //  根据 user id 修该 地址
//  映射数据表中的字段
    int updateAddressById(@Param("userId") Integer userId, @Param("postCode") String code);

    //    根据id删除
    int deleteAddressById(@Param("userId") Integer delId);
}
