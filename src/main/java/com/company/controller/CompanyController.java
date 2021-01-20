package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.CompanyProfileDTO;
import com.company.entity.Company;
import com.company.service.CompanyProfileService;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

	@Autowired
	CompanyProfileService companyProfileService;
	
	@GetMapping("/getById")
	@CrossOrigin
	public ResponseEntity<?> getCompanybyId(@PathVariable String id) {
		
		Company company = companyProfileService.getCompanyProfile(id);
		
		return ResponseEntity.ok(company);
	}
	
	@PostMapping("/save")
	@CrossOrigin
	public ResponseEntity<?> saveCompanyProfile(@RequestBody CompanyProfileDTO companyProfileDTO) throws Exception{
		Company company = companyProfileService.saveCompany(companyProfileDTO);
		
		if(company == null) {
			throw new Exception("failed to save");
		}
		
		return ResponseEntity.ok(company);
	}
	
	@GetMapping("/getAll")
	@CrossOrigin
	public ResponseEntity<?> getAll(){
		
		List<Company> result = companyProfileService.getAllCompany();
		
		return ResponseEntity.ok(result);
	}
	
}
