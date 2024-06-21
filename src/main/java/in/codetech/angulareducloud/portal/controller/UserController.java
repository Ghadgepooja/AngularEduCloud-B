package in.codetech.angulareducloud.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codetech.angulareducloud.portal.model.User;
import in.codetech.angulareducloud.portal.service.UserServiceimpl;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceimpl userService1;
	
	  @GetMapping("/{username}")
	    public User getUser(@PathVariable("username") String username) {
	        return this.userService1.getUser(username);
	    }
	  
	  
	  @DeleteMapping("/{userId}")
	  public void deleteUser(@PathVariable("userId") Long userId) {
		  this.userService1.deleteUser(userId);
		  
		  
	  }
	  

	
}
