package com.messi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private Repository repo;
	
	public void addUser(Object obj) {
		
		if(obj instanceof Customer) {
			obj = (Customer) new Customer();
			repo.save(obj);
			
		}else if(obj instanceof Agent) {
			obj = new Agent();
			repo.save(obj);
		}else if(obj instanceof BranchManager) {
			obj = new BranchManager();
			repo.save(obj);
			
		}else if(obj instanceof CEO) {
			obj = new CEO();
			repo.save(obj);
		}else if(obj instanceof Branch) {
			obj = new Branch();
			repo.save(obj);
		}
	}
	
public void delete(int id) {
		
		repo.deleteById(id);
	}
	
public void update(int id) {
	
	repo.save(id);
}
	

}
