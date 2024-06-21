package in.codetech.angulareducloud.portal.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codetech.angulareducloud.portal.Repositories.IQuestionReppository;
import in.codetech.angulareducloud.portal.model.Question;
import in.codetech.angulareducloud.portal.model.Quiz;


@Service("/questionservice")
public class QuestionServiceimpl implements QuestionService{
	@Autowired
	private IQuestionReppository Questionrepo;
	

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		
		
		return  Questionrepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		 if (Questionrepo.findById(question.getQuesId()) != null) {
	            return Questionrepo.save(question);
	        } else {
	            throw new RuntimeException("Category not found with id: " + question);
	        }
		
	}

	

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return Questionrepo.findById(questionId)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + questionId));

		
	}

	@Override
	public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteQuestion(Long quesId) {
		// TODO Auto-generated method stub
		 if (Questionrepo.existsById(quesId)) {
	            Questionrepo.deleteById(quesId);
	        } else {
	            throw new RuntimeException("Category not found with id: " + quesId);
	        }
	    
	}

	@Override
	public Question get(Long questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getQuestions() {
		return Questionrepo.findAll();
	}

//	@Override
//	public List<Question> getQuestions() {
//		// TODO Auto-generated method stub
//		return Questionrepo.findAll();
//	}

}
