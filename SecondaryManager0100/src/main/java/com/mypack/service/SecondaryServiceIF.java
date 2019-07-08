package com.mypack.service;

import java.util.List;

import com.mypack.entity.SecondaryMenu;

public interface SecondaryServiceIF {
	
	//�����˵�����һ���˵�id��ѯ
	public List<SecondaryMenu> queryAllMenuByA_Id(int a_Id);
	
	//�����˵����ݶ����˵�id��ѯ
	SecondaryMenu queryOneMenuById(int id);

	//�����޸ĵ���
	boolean updateMenu(SecondaryMenu menu);

	//������ӵ���
	boolean addMenu(SecondaryMenu menu);

	//����ɾ������
	boolean deleteMenu(int id);

}