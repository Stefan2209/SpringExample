package dao.impl;


import java.util.LinkedList;
import java.util.List;



import dao.DaoUser;
import domain.User;

public class DaoUserLinkedImpl implements DaoUser {
	
	List<User> list;
	
	public DaoUserLinkedImpl() {
		list = new LinkedList<User>();
	}
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println("Save in LinkedList");
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
