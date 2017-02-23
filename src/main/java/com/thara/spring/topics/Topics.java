package com.thara.spring.topics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOPIC")
public class Topics {
	@Id
	private String id;
	private String topicName;
	private String topicDesc;
	
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topics(String id, String topicName, String topicDesc) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDesc = topicDesc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	
	

}
