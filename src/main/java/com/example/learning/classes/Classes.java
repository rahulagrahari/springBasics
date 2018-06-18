package com.example.learning.classes;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.learning.school.School;

@Entity
public class Classes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String std;
	private int studentCount;
	@ManyToOne
    @JoinColumn(name = "schoolId", nullable = false)
	private School school;
	
	public Classes() {
	
	}
	public Classes(int id, String std, int studentCount, int schoolId) {
		super();
		Id = id;
		this.std = std;
		this.studentCount = studentCount;
		this.school = new School(schoolId, "");
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
}
