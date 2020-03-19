package config;

import org.springframework.context.annotation.Bean;

import dao.DaoUser;
import dao.impl.DaoUserLinkedImpl;
import dao.impl.DaoUserArrayImpl;
import domain.User;
import main.Main;
import service.ServiceUser;
import service.impl.ServiceUserImpl;


public class MyBeanConfig {
	
	
	@Bean(name = "main")
	public Main getMain() {
		return new Main();
	}
	@Bean(name = "user")
	public User getUser() {
		return new User();
	}
	@Bean(name = "linkedDaoUser")
	public DaoUser getDaoFirstImpl() {
		return new DaoUserLinkedImpl();
	}
	@Bean(name = "arrayDaoUser")
	public DaoUser getXMLRepository() {
		return new DaoUserArrayImpl();
	}
	
	@Bean(name = "userService")
	public ServiceUser getServiceUser() {
		return new ServiceUserImpl();
		
	}
}
