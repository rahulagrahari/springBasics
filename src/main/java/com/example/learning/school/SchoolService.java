package com.example.learning.school;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepo schoolRepo;
	
	public List<School> getAllSchool() {
		List<School> schools = new ArrayList<School>();
		schoolRepo.findAll().forEach(s -> schools.add((School) s));
		return schools;
		
	}

	public School getSchoolById(int id) {
		
		return schoolRepo.findById(id).get();
		
	}

	public void addSchool(School school) {
		schoolRepo.save(school);
		
	}



}
