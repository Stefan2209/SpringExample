package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.DaoUser;
import domain.User;

public class DaoUserArrayImpl implements DaoUser {
	List<User> list;
	
	public DaoUserArrayImpl() {
		list =  new ArrayList<User>();
	}
	public void save(User user) {
		
		// TODO Auto-generated method stub
		System.out.println("Save in ArrayList");
		list.add(user);

	}
	public List<User> getLista() {
		return list;
	}
	public void print() {
		for(User u: list) {
			System.out.println(u);
		}
	}
	

}
