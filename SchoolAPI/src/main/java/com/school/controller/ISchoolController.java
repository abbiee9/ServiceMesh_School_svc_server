package com.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.response.model.SchoolModel;


@RequestMapping(value="/api")
public interface ISchoolController {

	@RequestMapping(value="/studentdetails/schoolName/{schoolName}")
	public ResponseEntity<SchoolModel> getStudentByschoolName(@PathVariable String schoolName);
	
}
