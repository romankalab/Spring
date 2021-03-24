package com.appslab.springbootapp.Company;

import com.appslab.springbootapp.Company.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
