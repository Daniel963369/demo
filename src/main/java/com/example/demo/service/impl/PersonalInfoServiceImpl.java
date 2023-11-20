package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.Repository.PersonalInfoDao;
import com.example.demo.entity.MealId;
import com.example.demo.entity.PersonalInfo;
import com.example.demo.service.ifs.PersonnalInfoService;

@Service
public class PersonalInfoServiceImpl implements PersonnalInfoService{
	
	
	@Autowired
	private PersonalInfoDao personalInfoDao;

	@Override
	public PersonalInfo addInfo(PersonalInfo personalInfo) {
		String pattern = "[a-zA-Z][1-2]\\d{8}";
		if(!personalInfo.getId().matches(pattern)) {
			
			return null;
		}
		
		if(personalInfoDao.existsById(personalInfo.getId())){
			return null;
		}
		return personalInfoDao.save(personalInfo);
	}

	@Override
	public void addInfoList(List<PersonalInfo> infoList) {
		String pattern = "[a-zA-Z][1-2]\\d{8}";
		for(PersonalInfo item:infoList) {
			String id = item.getId();
			
			if(!StringUtils.hasText(id) || !id.matches(pattern)) {
				System.out.println("id error");
				return;
			}
		}
		personalInfoDao.saveAll(infoList);
	}
	


}
