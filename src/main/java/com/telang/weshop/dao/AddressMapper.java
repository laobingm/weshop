package com.telang.weshop.dao;

import com.telang.weshop.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

	Address[] selectAll();

	Address[] selectByUsername(String username);
}