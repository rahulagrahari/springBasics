package com.example.learning.classes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClassesRepo extends CrudRepository<Classes, Integer>{

	public List<Classes> findBySchoolId(int schoolId);
	
}
