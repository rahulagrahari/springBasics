package com.example.learning.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.school.School;
import com.example.learning.school.SchoolService;

@RestController
public class ClassesController {

	@Autowired
	private ClassesService classesService;
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(method=RequestMethod.GET, value="school/{schoolId}/classes")
	public List<Classes> getAllClasses(@PathVariable int schoolId){
		return classesService.getAllClasses(schoolId);
	}
//	@RequestMapping(method=RequestMethod.GET, value="school/{schoolId}/classes")
//	public Classes getClasses(int Id){
//		return classesService.getClassesById(Id);
//	}
	@RequestMapping(method=RequestMethod.POST, value="school/{schoolId}/classes/add")
	public List<Classes> addClasses(@RequestBody Classes classes, @PathVariable int schoolId){
		classes.setSchool(schoolService.getSchoolById(schoolId)); 
		classesService.add(classes);
		 return getAllClasses(schoolId);
	}
}
