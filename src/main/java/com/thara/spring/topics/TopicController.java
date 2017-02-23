package com.thara.spring.topics;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thara.spring.course.CourseResource;

@RestController
public class TopicController {
	
	@Autowired
	private TopicsService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topics topics){
		
		topicService.addTopics(topics);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/topics/{id}")
	public Topics getTopic(@PathVariable String id){
		
		return topicService.getTopicsById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topics topic, @PathVariable String id){
		
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
	public void updateTopic(@PathVariable String id){
		
		topicService.deleteTopics(id);
	}
	
	/*@RequestMapping("/topics/{id}/courses")
	public CourseResource getCourseResource() {
		return new CourseResource();
	}*/

}

