package net.xinqushi.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService userService = context.getBean(UserService.class);
		String list=userService.queryUserList();
//		for(User user:list) {
//			System.out.println(user.getUsername()+ " ," +user.getPassword()+",  "+user.getPassword());
//		}
//		
		System.out.println(list);
		context.destroy();
		
	}

}
