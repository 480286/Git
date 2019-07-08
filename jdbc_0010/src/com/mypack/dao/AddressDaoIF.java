package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Address;

public interface AddressDaoIF {

	//��ѯ����
	List<Address> queryAllAddress();

	//��ѯ����
	Address queryOneAddress(int id);

	//��ӵ���
	boolean addAddress(Address address);

	boolean deletAddress(int id);

	boolean updateAddress(Address address);

}