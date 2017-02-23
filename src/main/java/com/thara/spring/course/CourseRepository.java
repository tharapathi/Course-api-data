package com.thara.spring.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	List<Course> findByTopicsId(String topicId);

	/*
	 * Topics getTopicsById(String id);
	void addTopics(Topics topic);

	void updateTopic(String id, Topics topic);

	void deleteTopics(String topicId);*/
}
