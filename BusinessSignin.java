package com.FinalCodeGravityProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalCodeGravityProject.dataLayer.User;
import com.FinalCodeGravityProject.dataLayer.RepositoryOfuser;
import java.util.List;
@Service
public class BusinessSignin {
	@Autowired
	RepositoryOfUser ur;
	
	public List<User> getUser() {
        return ur.findAll();
    }
	
	public User getUserById(Long id) {
        return ur.findById(id).orElse(null);
    }
	
	
	 public User addUser(UserEntity user) {
	        return ur.save(user);
	    }

	    public void deleteUser(Long id) {
	        ur.deleteById(id);
	    }

	    public User updateUser(Long id, User correctedUser) {
	        User user = ur.findById(id).orElse(null);
	        user.setFirstName(correctedUser.getFirstName());
	        user.setLastName(correctedUser.getLastName());
	        user.setDateOfBirth(correctedUser.getDateOfBirth());
	        user.setLast4ssn(correctedUser.getLast4Ssn());
	        return ur.save(user);
	    }
}