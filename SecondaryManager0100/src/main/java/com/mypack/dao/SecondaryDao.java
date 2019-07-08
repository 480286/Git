package com.mypack.dao;

import java.util.List;

import com.mypack.entity.SecondaryMenu;

public interface SecondaryDao {
	
	public List<SecondaryMenu> queryAllMenuByA_Id(int a_Id);
	
	//������ѯ����
	public SecondaryMenu queryOneMenuById(int id);
	
	//�����޸ĵ���
	public boolean updateMenu(SecondaryMenu menu);
	
	//������ӵ���
	public boolean addMenu(SecondaryMenu menu);
	
	//����ɾ������
	public boolean deleteMenu(int id);

	
	
}
