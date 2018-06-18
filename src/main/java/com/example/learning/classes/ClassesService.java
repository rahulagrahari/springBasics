package com.example.learning.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesService {

	@Autowired
	private ClassesRepo classesRepo;

	public List<Classes> getAllClasses(int schoolId) {
		List<Classes> clss = new ArrayList<Classes>();
		classesRepo.findBySchoolId(schoolId).forEach(cls->clss.add((Classes) cls));
		return clss;
	}
	
	public Classes getClassesById(int id) {
		
		return classesRepo.findById(id).get();
	}

	public void add(Classes classes) {
		// TODO Auto-generated method stub
		classesRepo.save(classes);
	}
	
}
