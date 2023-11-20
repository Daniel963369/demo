package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonalInfo;



@Repository
public interface PersonalInfoDao extends JpaRepository<PersonalInfo, String>{
	
	public List<PersonalInfo> findByCity(String city);
	public List<PersonalInfo> findByNameAndCity(String name, String city);
	public List<PersonalInfo> findByNameOrCity(String name, String city);
		
	//·j´M¥\¯à
	public List<PersonalInfo> findByAgeGreaterThan(int age);
	
	public List<PersonalInfo> findByAgeLessThanEqualOrderByAge(int age);
	
	public List<PersonalInfo> findByAgeLessThanOrAgeGreaterThan(int age1,int age2);
	
	public List<PersonalInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1,int age2);
	
	public List<PersonalInfo>findByCityContaining(String city);
	
	public List<PersonalInfo>findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age,String city);

	
}
