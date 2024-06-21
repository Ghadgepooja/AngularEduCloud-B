package in.codetech.angulareducloud.portal.service;

import java.util.List;
import java.util.Set;

import in.codetech.angulareducloud.portal.model.Question;
import in.codetech.angulareducloud.portal.model.Quiz;

public interface QuestionService {
	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public List<Question> getQuestions();

	public Question getQuestion(Long questionId);

	public Set<Question> getQuestionsOfQuiz(Quiz quiz);

	public void deleteQuestion(Long quesId);

	public Question get(Long questionId);

}
