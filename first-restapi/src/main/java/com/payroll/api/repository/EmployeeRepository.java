package com.payroll.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.payroll.api.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}