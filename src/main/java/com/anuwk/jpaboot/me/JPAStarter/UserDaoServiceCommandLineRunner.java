package com.anuwk.jpaboot.me.JPAStarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anuwk.jpaboot.me.JPAStarter.entity.User;
import com.anuwk.jpaboot.me.JPAStarter.service.UserDaoService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner  {
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDaoService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","Admin");
		userDaoService.insert(user);
		log.info("New User is created: " + user);
	}
	
	

}
