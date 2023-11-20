package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.PersonalInfo;

public interface PersonnalInfoService {

	public PersonalInfo addInfo(PersonalInfo personalInfo);
	public void addInfoList(List<PersonalInfo> infoList);
}
