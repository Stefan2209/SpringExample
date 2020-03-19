package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dao.DaoUser;
import domain.User;
import service.ServiceUser;

public class ServiceUserImpl implements ServiceUser {
	
	private DaoUser daoUser;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		daoUser.save(user);
		

	}
	
	@Autowired
	@Qualifier (value = "arrayDaoUser")
	public void setDaoUser(DaoUser daoUser) {
		this.daoUser = daoUser;
	}

	
	public void print() {
		daoUser.print();
	}
	
	

}
