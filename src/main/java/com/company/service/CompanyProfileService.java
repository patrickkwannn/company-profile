package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.dto.CompanyProfileDTO;
import com.company.entity.Company;


public interface CompanyProfileService {

	public Company getCompanyProfile(String id);
	public Company saveCompany(CompanyProfileDTO company);
	public List<Company> getAllCompany();
	
}