package com.appslab.springbootapp.Company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
