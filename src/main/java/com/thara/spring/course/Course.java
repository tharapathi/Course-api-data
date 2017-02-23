package com.thara.spring.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.thara.spring.topics.Topics;

@Entity
@Table(name="COURSE")
public class Course {
	@Id
	private String courseId;
	private String courseName;
	private String courseDesc;
	
	@ManyToOne
	private Topics topics;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseId, String courseName, String courseDesc,String topicsId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.setTopics(new Topics(topicsId, "", ""));
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public Topics getTopics() {
		return topics;
	}
	public void setTopics(Topics topics) {
		this.topics = topics;
	}
	
	

}
