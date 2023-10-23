package com.ilker.RestCrud.dao;

import com.ilker.RestCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "empls")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
