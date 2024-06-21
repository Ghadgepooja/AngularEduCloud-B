package in.codetech.angulareducloud.portal.service;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codetech.angulareducloud.portal.Repositories.IQuizRepository;
import in.codetech.angulareducloud.portal.model.Category;
import in.codetech.angulareducloud.portal.model.Quiz;

@Service

public class Quizserviceimpl implements QuizService{
	@Autowired
	private IQuizRepository Quizrepo;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return Quizrepo.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		 if (Quizrepo.findById(quiz.getqId()) != null) {
	            return Quizrepo.save(quiz);
	        } else {
	            throw new RuntimeException("Category not found with id: " + quiz);
	        }
		
		
	}

	@Override
	public Set<Quiz> getQuizzes() {
		// TODO Auto-generated method stub
		return (Set<Quiz>) Quizrepo.findAll();
	}

	@Override
	public Quiz getQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return Quizrepo.findById(quizId)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + quizId));

		
	}

	@Override
	public void deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		if (Quizrepo.existsById(quizId)) {
            Quizrepo.deleteById(quizId);
        } else {
            throw new RuntimeException("Category not found with id: " + quizId);
        }
		
	}

	@Override
	public List<Quiz> getQuizzesOfCategory(java.util.Locale.Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> getActiveQuizzes() {
		// TODO Auto-generated method stub
		return Quizrepo.findByActive(true);
	}

	@Override
	public List<Quiz> getActiveQuizzesOfCategory(java.util.Locale.Category c) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	 
		
		

}
