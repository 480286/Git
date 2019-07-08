package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
public class UserController {
	@Autowired
	UserServiceIF usi;
	
	
	public UserServiceIF getUsi() {
		return usi;
	}

	public void setUsi(UserServiceIF usi) {
		this.usi = usi;
	}

	@RequestMapping("/dengLu")
	public String dengLu(User user){
		User u= usi.queryOneUser(user.getUsername());
		if(u!=null){
			if(u.getPassword().equals(user.getPassword())){
				System.out.println("��½�ɹ�");
				return "redirect:xinXi";
			}else{
				System.out.println("�������");
			}
		}else{
			System.out.println("�û���������");
		}
		return "redirect:index.jsp";
		
	}
	
	@RequestMapping("/zhuCe")
	public String zhuCe(User user){
		if(user.getUsername()==null||user.getPassword()==null){
			System.out.println("�˺Ż����벻��Ϊ��");
			return"redirect:zhuce.jsp";
		}
		User u= usi.queryOneUser(user.getUsername());
		if(u==null){
			usi.insertUser(user);
			System.out.println("ע��ɹ�");
			return "redirect:index.jsp";
		}else{
			System.out.println("���˻������Ѵ���");
			return"redirect:zhuce.jsp";
		}
	}
}
