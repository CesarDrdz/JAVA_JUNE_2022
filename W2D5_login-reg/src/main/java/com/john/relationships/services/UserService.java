package com.john.relationships.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.john.relationships.models.LoginUser;
import com.john.relationships.models.User;
import com.john.relationships.repos.UserRepository;

@Service
public class UserService {

//	CRUD
	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if (potentialUser.isPresent()) {
			result.rejectValue("email", "registerErrors", "this email is taken");
		}
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "registerErrors", "passwords don't match");
		}

//    	return the result back
		if (result.hasErrors()) {
			return null;
		} else {
//    		hash and set password, save the user to the DB!
			String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashedPW);
//    		SAVE USER TO THE DB!!!
			return userRepo.save(newUser);
		}

	}

	public User login(LoginUser newLoginObject, BindingResult result) {
//		FIND THE USER IN THE DB
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
		if (!potentialUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "email is not found");
		} else {
			
			User user = potentialUser.get();
//			Reject if BCrypt pass match fails
			if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginErrors", "invalid password");
			}
			if (result.hasErrors()) {
				return null;
			} else {
//				otherwise, return the user object
				return user;
			}
		}
		
		return null;
	}
	
//	FIND ONE
	public User findOne(Long id) {
    	Optional<User> potentialUser = userRepo.findById(id);
    	if (potentialUser.isPresent()) {
    		return potentialUser.get();
    	} else {
    		return null;
    	}
    }
	
	
	

}
