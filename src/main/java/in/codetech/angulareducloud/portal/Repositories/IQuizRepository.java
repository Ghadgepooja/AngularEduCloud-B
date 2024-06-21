package in.codetech.angulareducloud.portal.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codetech.angulareducloud.portal.model.Quiz;

public interface IQuizRepository extends JpaRepository<Quiz,Long> {

	List<Quiz> findByActive(boolean Active);

	
	
}
