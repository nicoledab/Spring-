package test.spring.bean;

import java.util.Date;

public class DTO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private Date day;
	
	public DTO() {}
	public DTO(String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	
	
	
	
}
