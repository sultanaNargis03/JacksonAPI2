package com.telusko.pojo;

import java.util.Arrays;

public class Implementers 
{
	private Integer id;
	private String name;
	private String city;
	private boolean active;
	//Has A
	private Course course;
	
	private String[] hobbies;
	
//	public Implementers() {
//		System.out.println("Impl pojo obj zero param cons");
//	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Implementers [id=" + id + ", name=" + name + ", city=" + city + ", active=" + active + ", course="
				+ course + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	
	
	
}
