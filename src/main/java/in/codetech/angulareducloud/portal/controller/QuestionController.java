package in.codetech.angulareducloud.portal.controller;

import java.util.Set;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import in.codetech.angulareducloud.portal.model.Question;
import in.codetech.angulareducloud.portal.service.QuestionService;
import in.codetech.angulareducloud.portal.service.QuestionServiceimpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/question")

public class QuestionController {
@Autowired
private QuestionServiceimpl questionservice;

@PostMapping("/create")
public ResponseEntity<Question> add(@RequestBody Question question) {
    return ResponseEntity.ok(this.questionservice.addQuestion(question));
}

@GetMapping("/{quesId}")
public Question get(@PathVariable("quesId") Long quesId) {
    return this.questionservice.getQuestion(quesId);
}

@PutMapping("/update")
public ResponseEntity<Question> update(@RequestBody Question question) {
    return ResponseEntity.ok(this.questionservice.updateQuestion(question));
}


@DeleteMapping("/delete/{id}")
public void deletQuestion(@PathVariable long id)
{
	questionservice.deleteQuestion(id);
	
}
	




	
}
