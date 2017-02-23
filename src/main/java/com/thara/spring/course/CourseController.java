package com.thara.spring.course;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thara.spring.topics.Topics;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourse(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics/{id}/courses")
	public int addCourse(@PathVariable String id,@RequestBody Course courses){
		courses.setTopics(new Topics(id, "", ""));
		
		courseService.addCourse(courses);
		return Response.SC_OK;
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		
		return courseService.getCourseById(courseId);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String courseId,
			@PathVariable String id){
		course.setTopics(new Topics(id, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}/courses/{courseId}")
	public void updateCourse(@PathVariable String courseId){
		
		courseService.deleteCourse(courseId);
	}

}

