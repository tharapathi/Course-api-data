package com.thara.spring.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*private List<Course> listTopics = null;
	
	public CourseService(){
		listTopics = new ArrayList<Course>();
		
		listTopics.add(new Course("Spring", "Spring FrameWork", "Spring Application."));
		listTopics.add(new Course("Java", "Java Application", "Java is an powerFul language."));
		listTopics.add(new Course("JavaScript", "JavaScript framework", "JavaScript is scripting language."));
	}
	*/
	
	public List<Course> getAllCourses(String id){
		
//		return listTopics;
		List<Course> listOfCourses = new ArrayList<>();
		courseRepository.findByTopicsId(id).forEach(listOfCourses :: add);
		
		return listOfCourses;
	}
	
	public Course getCourseById(String id){
		
//		return listTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
		
	}
	public void addCourse(Course course){
		
//		listTopics.add(topic);
		courseRepository.save(course);
	}
	

	public void updateCourse(Course course) {

		/*for (int i = 0; i < listTopics.size(); i++) {
			
			Topics fetchTopic = listTopics.get(i);
			
			if(fetchTopic.getId().equals(id)){
				listTopics.set(i, topic);
				System.out.println(listTopics);
				return;
			}
		}*/
		courseRepository.save(course);
	}
	
	public void deleteCourse(String courseId){
		
//		listTopics.removeIf(T -> T.getId().equals(topicId));
		courseRepository.delete(courseId);
	}
	

}
