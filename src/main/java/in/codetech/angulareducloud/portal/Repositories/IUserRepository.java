package in.codetech.angulareducloud.portal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloud.portal.model.User;

public interface IUserRepository  extends JpaRepository<User,Long>{

	User findByUsername(String username);

}
