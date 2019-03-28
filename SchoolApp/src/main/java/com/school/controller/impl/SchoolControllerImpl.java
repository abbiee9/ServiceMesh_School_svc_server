package com.school.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.school.controller.ISchoolController;
import com.school.response.model.SchoolModel;
import com.school.service.SchoolService;

@RestController
public class SchoolControllerImpl implements ISchoolController {
	
	@Autowired
	private SchoolService schoolService;

	@Override
	public ResponseEntity<SchoolModel> getStudentByschoolName(String schoolName) {
		 return ResponseEntity.status(HttpStatus.OK).body(schoolService.getStudentByschoolName(schoolName));
	}
	
}
