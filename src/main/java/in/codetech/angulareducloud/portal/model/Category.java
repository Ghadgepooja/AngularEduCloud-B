package in.codetech.angulareducloud.portal.model;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")

public class Category {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)


	private Long cid;
@Column
	private String title;
@Column
	private String description;


@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
@JsonIgnore
private Set<Quiz> quizess = new LinkedHashSet<>();

public Long getCid() {
	return cid;
}
public void setCid(Long cid) {
	this.cid = cid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}