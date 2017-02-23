package com.thara.spring.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topics, String>{
	
	/*List<Topics> getAllTopics();

	Topics getTopicsById(String id);
	void addTopics(Topics topic);

	void updateTopic(String id, Topics topic);

	void deleteTopics(String topicId);*/
}
