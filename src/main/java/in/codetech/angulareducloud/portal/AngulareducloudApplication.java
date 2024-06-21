package in.codetech.angulareducloud.portal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.codetech.angulareducloud.portal.Repositories.IQuizRepository;
import in.codetech.angulareducloud.portal.model.Role;
import in.codetech.angulareducloud.portal.model.User;
import in.codetech.angulareducloud.portal.model.UserRole;
import in.codetech.angulareducloud.portal.service.UserServiceimpl;

@SpringBootApplication
public class AngulareducloudApplication implements CommandLineRunner{
@Autowired
private UserServiceimpl userService;

@Autowired
private IQuizRepository quizRepo;


	public static void main(String[] args) {
		SpringApplication.run(AngulareducloudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {System.out.println("the code is starting");
		
		User user=new User();
		user.setFirstname("pooja");
		user.setLastname("Ghadge");
		user.setUsername("admin12345");
		user.setPassword("abcde");
		user.setEmail("pooja123@gmail.com");
		user.setProfile("default.png");
		
		Role role=new Role();
		
		role.setRoleId(101L);
		role.setRoleName("ADMIN");
		
		
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User User1=this.userService.createUser(user, userRoleSet);
		System.out.println(User1.getUsername());
	
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
