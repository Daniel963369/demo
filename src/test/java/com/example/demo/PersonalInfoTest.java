package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.PersonalInfoDao;
import com.example.demo.entity.PersonalInfo;
import com.example.demo.service.ifs.PersonnalInfoService;

@SpringBootTest
public class PersonalInfoTest {

	@Autowired
	private PersonnalInfoService personnalInfoService;
	
	@Autowired
		private PersonalInfoDao personalInfoDao;

	@Test
	public void addnfoTest() {
		personnalInfoService.addInfo(new PersonalInfo("C289543210","hihi",15,"�O�n��"));//��浧��
	}
	
	@Test
	public void daoSaveAllTest() {
		List<PersonalInfo>list = new ArrayList<>();//�i�H�@����h��
		list.add(new PersonalInfo("C289543211","bubu",18,"�O����"));
		list.add(new PersonalInfo("C289543212","cici",20,"�O�_��"));
		list.add(new PersonalInfo("C289543213","gigi",17,"�O����"));
		list.add(new PersonalInfo("C289543214","kiki",22,"�O�n��"));
		personalInfoDao.saveAll(list);
	}
	
	@Test
	public void daoFindTest() {
		Optional<PersonalInfo> infoOp = personalInfoDao.findById("C289543211");
		if(infoOp.isEmpty()) {
			System.out.println("Not found");
			return;
		}else {
			System.out.println(infoOp.get().getCity());
		}
	}
	
	@Test
	public void daoFindAllTest() {
		List<PersonalInfo> list = personalInfoDao.findAll();
		for(PersonalInfo item:list) {
			System.out.println(item.getCity());
		}
	}
	
	@Test
	public void daoFindTest2() {
		boolean result = personalInfoDao.existsById("C289543211");
		System.out.println(result);
	}
	
	@Test
	public void daoFindTest3() {
		 List<PersonalInfo> result = personalInfoDao.findByCity("�O����");
		 System.out.println(result.size());
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName());
		 }
	}
	
	@Test
	public void daoFindBiggerAge() {
		 List<PersonalInfo> result = personalInfoDao.findByAgeGreaterThan(16);
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	@Test
	public void daoFindLessThanEqualAgeOrderByAge() {
		 List<PersonalInfo> result = personalInfoDao.findByAgeLessThanEqualOrderByAge(16);
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	@Test
	public void doubleDao() {
		 List<PersonalInfo> result =personalInfoDao.findByAgeLessThanOrAgeGreaterThan(20,16);
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	@Test
	public void doubleDao2() {
		 List<PersonalInfo> result =personalInfoDao.findTop3ByAgeBetweenOrderByAgeDesc(16,20);
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	@Test
	public void containingTest() {
		 List<PersonalInfo> result =personalInfoDao.findByCityContaining("��");
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	@Test
	public void doubleDao3() {
		 List<PersonalInfo> result =personalInfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(16,"��");
		 for(PersonalInfo item:result) {
			 System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getCity());
		 }
	}
	
	
	}
