package pers.jokereven.dao;

import org.springframework.stereotype.Repository;
import pers.jokereven.entity.Address;

@Repository
public class AddressDaoImpl implements AddressDao{
    @Override
    public void save(Address address) {
        System.out.println("save ok");
    }
}
