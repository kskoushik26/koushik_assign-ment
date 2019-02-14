	package com.koushik.Assignment12;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
 public int questionId;
 public String question;
 List<String> listanswer;
 Set<String> setanswer;
 Map<Integer,String> mapanswer;
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getListanswer() {
	return listanswer;
}
public void setListanswer(List<String> listanswer) {
	this.listanswer = listanswer;
}
public Set<String> getSetanswer() {
	return setanswer;
}
public void setSetanswer(Set<String> setanswer) {
	this.setanswer = setanswer;
}
public Map<Integer,String> getMapanswer() {
	return mapanswer;
}
public void setMapanswer(Map<Integer,String> mapanswer) {
	this.mapanswer = mapanswer;
}
@Override
public String toString() {
	return "Question [questionId=" + questionId + ", question=" + question
			+ ", listanswer=" + listanswer + ", setanswer=" + setanswer
			+ ", mapanswer=" + mapanswer + "]";
}
 



}