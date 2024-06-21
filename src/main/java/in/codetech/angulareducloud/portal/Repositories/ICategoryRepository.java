package in.codetech.angulareducloud.portal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.codetech.angulareducloud.portal.model.Category;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
	

}
