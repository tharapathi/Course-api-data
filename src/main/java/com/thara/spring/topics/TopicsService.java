package com.thara.spring.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topics> getAllTopics(){
		
//		return listTopics;
		List<Topics> listTopics = new ArrayList<>();
		topicRepository.findAll().forEach(listTopics :: add);
		
		return listTopics;
	}
	
	public Topics getTopicsById(String id){
		
//		return listTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
		
	}
	public void addTopics(Topics topic){
		
//		listTopics.add(topic);
		topicRepository.save(topic);
	}
	

	public void updateTopic(String id, Topics topic) {

		/*for (int i = 0; i < listTopics.size(); i++) {
			
			Topics fetchTopic = listTopics.get(i);
			
			if(fetchTopic.getId().equals(id)){
				listTopics.set(i, topic);
				System.out.println(listTopics);
				return;
			}
		}*/
		topicRepository.save(topic);
	}
	
	public void deleteTopics(String topicId){
		
//		listTopics.removeIf(T -> T.getId().equals(topicId));
		topicRepository.delete(topicId);
	}
	

}
