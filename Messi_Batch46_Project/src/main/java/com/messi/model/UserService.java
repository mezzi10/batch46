package com.messi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private Repository repo;
	
	public void addUser(Object user) {
		if(user instanceof Customer) {
			user = (Customer) new Customer();
			repo.save(user);
			
		}else if(user instanceof Agent) {
			user = new Agent();
			repo.save(user);
		}else if(user instanceof BranchManager) {
			user = new BranchManager();
			repo.save(user);
			
		}else if(user instanceof CEO) {
			user = new CEO();
			repo.save(user);
		}
	}
	
	

}
