package com.company.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.CompanyRepository;
import com.company.dto.CompanyProfileDTO;
import com.company.entity.Company;
import com.company.service.CompanyProfileService;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService{

	@Autowired 
	CompanyRepository companyRepository;
	
	public Company getCompanyProfile(String id) {
		return companyRepository.getOne(id);
	}

	public Company saveCompany(CompanyProfileDTO company){
		Company result = new Company();
		result.setName(company.getName());
		result.setAddress(company.getAddress());
		result.setDirop(company.getDirop());
		result.setDescription(company.getDescription());
		result.setKomisaris(company.getKomisaris());
		result.setKomisarisUtama(company.getKomisarisUtama());
		result.setCreatedDate(new Date());
		
		companyRepository.save(result);
		return result;
	}

	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

}
