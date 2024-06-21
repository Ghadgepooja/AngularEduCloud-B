package in.codetech.angulareducloud.portal.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codetech.angulareducloud.portal.Repositories.IRole;
import in.codetech.angulareducloud.portal.Repositories.IUserRepository;
import in.codetech.angulareducloud.portal.helper.UserFoundException;
import in.codetech.angulareducloud.portal.model.User;
import in.codetech.angulareducloud.portal.model.UserRole;

@Service

public class UserServiceimpl implements UserService {
	


	    @Autowired
	    private IUserRepository userRepository;

	    @Autowired
	    private IRole roleRepository;

	    //creating user
	    @Override
	    public User createUser(User user, Set<UserRole> userRoles) throws Exception {


	        User local = this.userRepository.findByUsername(user.getUsername());
	        if (local != null) {
	            System.out.println("User is already there !!");
	            throw new UserFoundException();
	        } else {
	            //user create
	            for (UserRole ur : userRoles) {
	                roleRepository.save(ur.getRole());
	            }

	            user.getUserRoles().addAll(userRoles);
	            local = this.userRepository.save(user);

	        }

	        return local;
	    }

	    //getting user by username
	    @Override
	    public User getUser(String username) {
	        return this.userRepository.findByUsername(username);
	    }

	    @Override
	    public void deleteUser(Long userId) {
	        this.userRepository.deleteById(userId);
	    }


	}

