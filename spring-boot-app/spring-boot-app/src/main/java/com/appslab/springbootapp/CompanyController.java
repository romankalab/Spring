package com.appslab.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/company")
    void company() {
        Company company1 = new Company(1, "company1");
        companyService.saveCompany(company1);
    }
}
