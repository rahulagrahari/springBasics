package com.example.learning.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(method=RequestMethod.GET, value="/school")
	public List<School> getAllSchools(){
		return schoolService.getAllSchool();
 
		}
	@RequestMapping(method=RequestMethod.GET, path="/school/{id}")
	public School getSchool(@PathVariable int id) {
		return schoolService.getSchoolById(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="school/add")
	public List<School> addSchool(@RequestBody School school) {
		schoolService.addSchool(school);
		return getAllSchools();
	}
	
}
