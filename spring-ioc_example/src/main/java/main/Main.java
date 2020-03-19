package main;

import java.awt.Container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import domain.User;
import service.ServiceUser;
import service.impl.ServiceUserImpl;

public class Main {

	public static void main(String[] args) {


		
	
		Main main = makeMain();
	

		User user1 = main.makeUser(); 
		user1.setFirstName("Milos");
		user1.setLastName("Mijatovic");
		user1.setUsername("milos");
		user1.setPassword("123");
		
		User user2 = main.makeUser(); 
		user2.setFirstName("Ana");
		user2.setLastName("Anic");
		user2.setUsername("ana");
		user2.setPassword("111");
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		
		main.addUser(container, user1);
		main.addUser(container, user2);
		main.printUsers(container);
		
		

	}

	public static Main makeMain() {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		return  container.getBean("main", Main.class);
	}

	public User makeUser() {
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		return  container.getBean("user", User.class);
	}
	
	public void addUser(BeanFactory container, User user) {
		ServiceUser service = container.getBean("userService", ServiceUser.class);
		service.save(user);
	}
	public void printUsers(BeanFactory container) {
		ServiceUser service = container.getBean("userService", ServiceUser.class);
		service.print();
		
		
		
	}
	

	

}
