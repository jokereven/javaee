package pers.jokereven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jokereven.dao.AddressDao;
import pers.jokereven.entity.Address;

@Service("service")
public class AddressServiceImpl implements AddressService{
//    dao对象

    @Autowired
    private AddressDao dao;

    @Override
    public void AddAddress(Address address) {
        dao.save(address);
    }
}
