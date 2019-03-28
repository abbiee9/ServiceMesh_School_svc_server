package com.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.school.response.model.SchoolModel;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	List<SchoolModel> modelList = new ArrayList<SchoolModel>();
	SchoolServiceImpl()
	{
		for(int i=0;i<3;i++)
		{
			SchoolModel model = new SchoolModel();
			model.setAddress("addr_"+i);
			model.setPlace("Jhusi_"+i);
			model.setSchoolName("Canaryhira"+i);
			model.setYearJoined("200"+i);
			modelList.add(model);
		}
		
	}

	public SchoolModel getStudentByschoolName(String schoolName) {
		SchoolModel newModel = new SchoolModel();
		modelList.forEach(model->{
			if(model.getSchoolName().equalsIgnoreCase(schoolName))

			{
				newModel.setAddress(model.getAddress());
				newModel.setPlace(model.getPlace());
				newModel.setSchoolName(schoolName);
				newModel.setYearJoined(model.getYearJoined());
			}
		});
		return newModel;
	}

}
