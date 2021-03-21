package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    public Company getCompany(int id) {
        return companyRepository.findById(id).get();
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public void updateCompany(int id, Company company) {
        companyRepository.save(company);
    }

    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    }

}
