package com.cg1.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	public Employee(List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	public void init() {
		System.out.println("Calling Intit Method");
	}
	
	public void destroy() {
		System.out.println("Calling destroy method");
	}

}
