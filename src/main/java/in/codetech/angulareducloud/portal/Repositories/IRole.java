package in.codetech.angulareducloud.portal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloud.portal.model.Role;

public interface IRole extends JpaRepository<Role,Integer> {
	

}
